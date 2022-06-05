package com.example.landapp_molly.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.landapp_molly.R
import com.example.landapp_molly.datas.Room


//  ArrayAdapter 클래스 상속
class RoomAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Room>) : ArrayAdapter<Room>(mContext,resId,mList) {

    val inflater = LayoutInflater.from(mContext)


//  room_list_item.xml 레이아웃을 오버라이딩
//    return super 삭제

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var temprow = convertView
        if(temprow == null) {
            temprow = inflater.inflate(R.layout.room_list_item,null)
        }

        val row = temprow!!

        val roomData = mList[position]
        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)
        val descriptionTxt = row.findViewById<TextView>(R.id.descriptionTxt)

        descriptionTxt.text = roomData.description
        addressAndFloorTxt.text = "${roomData.address}, ${roomData.getFormattedFloor()}"
        return row




        return row

    }

}