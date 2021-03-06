package com.neppplus.jickbangcopy_20210320

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.neppplus.jickbangcopy_20210320.Adapters.RoomAdapter
import com.neppplus.jickbangcopy_20210320.datas.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRooms = ArrayList<Room>()

    lateinit var mRoomAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRooms.add(Room(7500, "서울시 동대문구", 2, "동대문구 방입니다."))
        mRooms.add(Room(18500, "서울시 서대문구", 0, "서대문구 방입니다."))
        mRooms.add(Room(23000, "서울시 마포구", -3, "마포구 방입니다."))
        mRooms.add(Room(150000, "서울시 중구", 8, "중구 방입니다."))
        mRooms.add(Room(6500, "서울시 강남구", 12, "강남구 방입니다."))
        mRooms.add(Room(1500, "서울시 은평구", -4, "은평구 방입니다."))
        mRooms.add(Room(9800, "서울시 서초구", 50, "서초구 방입니다."))
        mRooms.add(Room(7777, "서울시 동대문구", 2, "동대문구 방입니다."))
        mRooms.add(Room(9900, "서울시 용산구", -2, "용산구 방입니다."))
        mRooms.add(Room(10000, "서울시 동대문구", 1, "동대문구 방입니다."))

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRooms)

        roomListView.adapter = mRoomAdapter


        roomListView.setOnItemClickListener { parent, view, position, id ->
            val clickedRoom = mRooms[position]
            val myIntent = Intent(this, ViewRoomDetailActivity::class.java)
            myIntent.putExtra("roomInfo", clickedRoom)
            startActivity(myIntent)
        }

    }
}