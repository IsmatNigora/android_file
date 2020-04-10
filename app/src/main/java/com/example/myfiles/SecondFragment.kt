package com.example.myfiles

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.time.format.DateTimeFormatter
import java.time.LocalDateTime
/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_second).setOnClickListener {
            val parseDate =
                LocalDateTime.parse("2018-12-12T09:55:00", DateTimeFormatter.ISO_DATE_TIME)
            val formattedDate =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH::mm")//   val formattedDate=DateTimeFormatter.ofPattern("dd-MM-yyyy")
            val formattedDate_2 =
                DateTimeFormatter.ofPattern("_dd_MM_yyyy__HH_mm")
            //Здесь выкидывает
            //   val date=LocalDateTime.parse("31-12-2018",formattedDate)
            val date = parseDate.format(formattedDate)
            var date2 = parseDate.format(formattedDate_2)
            var message = "Текущая дата и время " + date
            var message_0 =  "D"+date2
            // var message="My {date}"+parseDate

            Toast.makeText(context, message, Toast.LENGTH_SHORT)
                .show()//   Toast.makeText(applicationContext(),"My {date}", Toast.LENGTH_LONG).show()//.makeText(this,"My {date}", Toast.LENGTH_LONG).show()
/*var filename="dracula"
        context.openFileOutput(filename, Context.MODE_PRIVATE).use{
            it.write(message.toByteArray())

        }
            var file=File(context.filesDir,"myfile.txt")
            var contents=file.readText()
*/
//            applicationContext.assets.open()
        /*    val filename="data.txt"//message
            val path=context.getFileStreamPath()//.getFileDir()
            val dir=File(path,"LET")
            dir.mkdirs()
            var file=File(dir,filename)
            val isNewFileCreated=file.createNewFile()
            var message2=""
            message+=isNewFileCreated
            /*if(isNewFileCreated){println("файл создан успешно")}
            else {println("файл уже создан")}
      */      Toast.makeText(context, message2, Toast.LENGTH_SHORT)
                .show()
*/
  /*          val filename=//"src/resources/" +
//                    "/bin/" +
                            "date60.txt"
            val myFile=File(filename)
    //        var isNewFileCreated=
         //           myFile.createNewFile()
           //var isNewFileCreated:Boolean=
            myFile.createNewFile()
if(myFile.exists()){

     Toast.makeText(context, "св", Toast.LENGTH_SHORT).show()

}*/ /*var filename="assd.txt"
       val warp=File("/sdcard/Wallpaper/")
            warp.mkdirs()
            val outfile=File(warp, filename)
            try{val fos=FileOutputStream(outfile)
            outfile.createNewFile()
            } catch(e: FileNotFoundException){e.printStackTrace()}
         //   Toast.makeText(context, ""+isNewFileCreated+"", Toast.LENGTH_SHORT).show()
//            println("файл")

//File f=new File("F:\\program1.rxt");
            if(!outfile.exists()){
                Toast.makeText(context, "j", Toast.LENGTH_SHORT).show()


            }*/
            val file=File(context?.filesDir,"$message_0.txt")//val file=File(context?.filesDir,"das.txt")
file.createNewFile()
            file.appendText("$message_0")//        file.appendText(" rec")
            val readResult=FileInputStream(file).bufferedReader().use{it.readText()}
println( "readRes=$readResult")
            Toast.makeText(context, "$readResult", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)


        }
    }
}
