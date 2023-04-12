package com.first.recyclerviewodev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var filmlerlist:ArrayList<Filmler>
    lateinit var adapter:Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerview_id.setHasFixedSize(true)
        recyclerview_id.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)



        var f1 =Filmler(1,"Aquaman","aquaman",15.99)
        var f2 =Filmler(2,"Batman","batman",10.99)
        var f3 =Filmler(3,"İronman","ironman",19.99)
        var f4 =Filmler(4,"Spiderman","spiderman",18.99)
        var f5 =Filmler(5,"Superman","asdqwe",9.99)

        filmlerlist=ArrayList<Filmler>()
        filmlerlist.add(f1)
        filmlerlist.add(f2)
        filmlerlist.add(f3)
        filmlerlist.add(f4)
        filmlerlist.add(f5)

        adapter= Adapter(this@MainActivity,filmlerlist)
        recyclerview_id.adapter=adapter



    }
}