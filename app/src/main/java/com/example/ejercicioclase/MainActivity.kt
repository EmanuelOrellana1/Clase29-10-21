package com.example.ejercicioclase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    private lateinit var tex_Nombre:EditText
    private lateinit var tex_Apellido:EditText
    private lateinit var spn_Depart:Spinner
    private lateinit var spn_Munic:Spinner
    private lateinit var tex_Telefono:EditText
    private lateinit var rb_Femenino:RadioButton
    private lateinit var rb_Masculino:RadioButton
    private lateinit var texv_inf:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tex_Nombre= findViewById(R.id.tex_Nombre)
        tex_Apellido = findViewById(R.id.tex_Apellido)
        spn_Depart = findViewById(R.id.spn_Depart)
        spn_Munic = findViewById(R.id.spn_Munic)
        tex_Telefono = findViewById(R.id.tex_Telefono)
        rb_Femenino = findViewById(R.id.rb_Femenino)
        rb_Masculino = findViewById(R.id.rb_Masculino)
        texv_inf = findViewById(R.id.texv_inf)

        val Departamentos = arrayOf("Chalatenango", "Santa Ana", "Ahuachapán", "Sonsonate", "San Salvador", "La Libertad", "Cuscatlán", "San Miguel", "Morazán", "San Vicente", "Usulután", "Cabañas", "La Paz", "La Unión")

        var datosSpinerDep = ArrayAdapter(this, android.R.layout.simple_spinner_item, Departamentos)
        spn_Depart.adapter = datosSpinerDep

        fun Municipios(department:String):ArrayList<String>{

            var municipiosList = arrayListOf<String>()

            when(department){
                "Chalatenango"->municipiosList.addAll(listOf("Agua Caliente","Arcatao","Azacualpa","Chalatenango","Citalá","Comalapa","Concepción Quezaltepeque",
                    "Dulce Nombre de María","El Carrizal","El Paraíso","La Laguna","La Palma","La Reina","Las Vueltas","Nombre de Jesús","Nueva Concepción",
                    "Nueva Trinidad","Ojos de Agua","Potonico","San Antonio de la Cruz","San Antonio Los Ranchos","San Fernando","San Francisco Lempa",
                    "San Francisco Morazán","San Ignacio","San Isidro Labrador","San José Cancasque (Cancasque)","San José Las Flores","San Luis del Carmen",
                    "San Miguel de Mercedes","San Rafael","Santa Rita","Tejutla"))
                "San Salvador"->municipiosList.addAll(listOf("Aguilares","Apopa","Ayutuxtepeque","Ciuddad Delgado","Cuscatancingo","El Paisnal","Guazapa","Ilopango",
                    "Mejicanos","Nejapa","Panchimalco","Rosario de Mora","San Marcos","San Martín","San Salvador","Santiago Texacuangos","Santo Tomás",
                    "Soyapango","Tonacatepeque"))
                "Sonsonate"->municipiosList.addAll(listOf("Acajutla","Armenia","Caluco","Cuisnahuat","Izalco","Juayúa","Nahuizalco","Nahulingo","Salcoatitán",
                    "San Antonio del Monte","San Julián","Santa Catarina Masahuat","Santa Isabel Ishuatán","Santo Domingo de Guzmán","Sonsonate",
                    "Sonzacate"))
                "La Paz"->municipiosList.addAll(listOf("Cuyultitán","El Rosario (Rosario de La Paz)","Jerusalén","Mercedes La Ceiba","Olocuilta","Paraíso de Osorio",
                    "San Antonio Masahuat","San Emigdio","San Francisco Chinameca","San Juan Nonualco","San Juan Talpa","San Juan Tepezontes",
                    "San Luis La Herradura","San Luis Talpa","San Miguel Tepezontes","San Pedro Masahuat","San Pedro Nonualco","San Rafael Obrajuelo",
                    "Santa María Ostuma","Santiago Nonualco","Tapalhuaca","Zacatecoluca"))
                "La Libertad"->municipiosList.addAll(listOf("Antiguo Cuscatlán","Chiltiupán","Ciudad Arce","Colón","Comasagua","Huizúcar","Jayaque","Jicalapa",
                    "La Libertad","Santa Tecla (Nueva San Salvador)","Nuevo Cuscatlán","San Juan Opico","Quezaltepeque","Sacacoyo",
                    "San José Villanueva","San Matías","San Pablo Tacachico","Talnique","Tamanique","Teotepeque","Tepecoyo","Zaragoza"))
                "San Miguel"->municipiosList.addAll(listOf("Carolina","Chapeltique","Chinameca","Chirilagua","Ciudad Barrios","Comacarán","El Tránsito","Lolotique",
                    "Moncagua","Nueva Guadalupe","Nuevo Edén de San Juan","Quelepa","San Antonio del Mosco","San Gerardo","San Jorge",
                    "San Luis de la Reina","San Miguel","San Rafael Oriente","Sesori","Uluazapa"))
                "Usulután"->municipiosList.addAll(listOf("Alegría","Berlín","California","Concepción Batres","El Triunfo","Ereguayquín","Estanzuelas","Jiquilisco",
                    "Jucuapa","Jucuarán","Mercedes Umaña","Nueva Granada","Ozatlán","Puerto El Triunfo","San Agustín","San Buenaventura",
                    "San Dionisio","San Francisco Javier","Santa Elena","Santa María","Santiago de María","Tecapán","Usulután"))
                "Cabañas"->municipiosList.addAll(listOf("Cinquera","Dolores (Villa Doleres)","Guacotecti","Ilobasco","Jutiapa","San Isidro",
                    "Sensuntepeque","Tejutepeque","Victoria"))
                "Santa Ana"->municipiosList.addAll(listOf("Candelaria de la Frontera","Chalchuapa","Coatepeque","El Congo","El Porvenir","Masahuat","Metapán",
                    "San Antonio Pajonal","San Sebastián Salitrillo","Santa Ana","Santa Rosa Guachipilín","Santiago de la Frontera","Texistepeque"))
                "San Vicente"->municipiosList.addAll(listOf("Apastepeque","Guadalupe","San Cayetano Istepeque","San Esteban Catarina","San Ildefonso","San Lorenzo",
                    "San Sebastián","San Vicente","Santa Clara","Santo Domingo","Tecoluca","Tepetitán","Verapaz"))
                "La Unión"->municipiosList.addAll(listOf("Anamorós","Bolívar","Concepción de Oriente","Conchagua","El Carmen","El Sauce","Intipucá","La Unión","Lilisque",
                    "Meanguera del Golfo","Nueva Esparta","Pasaquina","Polorós","San Alejo","San José","Santa Rosa de Lima","Yayantique","Yucuaiquín"))
                "Morazán"->municipiosList.addAll(listOf("Arambala","Cacaopera","Chilanga","Corinto","Delicias de Concepción","El Divisadero","El Rosario","Gualococti",
                    "Guatajiagua","Joateca","Jocoaitique","Jocoro","Lolotiquillo","Meanguera","Osicala","Perquín","San Carlos","San Fernando",
                    "San Francisco Gotera","San Isidro","San Simón","Sensembra","Sociedad","Torola","Yamabal","Yoloaiquín"))
                "Cuscatlán"->municipiosList.addAll(listOf("Candelaria","Cojutepeque","El Carmen","El Rosario","Monte San Juan","Oratorio de Concepción","San Bartolomé Perulapía",
                    "San Cristóbal","San José Guayabal","San Pedro Perulapán","San Rafael Cedros","San Ramón","Santa Cruz Analquito","Santa Cruz Michapa",
                    "Suchitoto","Tenancingo"))
                "Ahuachapán"->municipiosList.addAll(listOf("Ahuachapán","Apaneca","Atiquizaya","Concepción de Ataco","El Refugio","Guaymango","Jujutla",
                    "San Francisco Menéndez","San Lorenzo","San Pedro Puxtla","Tacuba","Turín"))
            }

            return municipiosList
        }
        spn_Depart?.onItemSelectedListener = object:AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                var department:String=spn_Depart.selectedItem.toString()
                val datosSpinerMunicipios = ArrayAdapter(applicationContext, android.R.layout.simple_spinner_item, Municipios(department))
                spn_Munic.adapter = datosSpinerMunicipios
            }
        }
    }


    var InformationU = arrayListOf<Array<String>>()

    fun GuardarInfo(Save:View){

        var nombres = tex_Nombre.text.toString()
        var apellidos = tex_Apellido.text.toString()
        var telefono = tex_Telefono.text.toString()
        var depart= spn_Depart.selectedItem.toString()
        var municip= spn_Munic.selectedItem.toString()
        var sexo = ""

        if(rb_Masculino.isChecked == true){
            sexo = "Masculino"
        }
        else if(rb_Femenino.isChecked == true){
            sexo = "Femenino"
        }

        InformationU.clear()
        InformationU.addAll(listOf(arrayOf(nombres, apellidos, telefono, sexo, depart, municip)))

        texv_inf.setText("")
        Toast.makeText(this, "¡Registro Guardado Con Exito!", Toast.LENGTH_SHORT).show()
    }

    fun MostrarInfo(Show:View){

        for(i in 0..InformationU.size-1){
            texv_inf.append(InformationU[i].get(0).toString()+"\n "+InformationU[i].get(1).toString()+", con número \n"+
                    InformationU[i].get(2).toString()+" su sexo es \n"+InformationU[i].get(3).toString()+", usted pertenece a \n"+InformationU[i].get(5).toString()+", "+
                    InformationU[i].get(4).toString()+".")
        }

        tex_Nombre.setText("")
        tex_Apellido.setText("")
        spn_Depart.setSelection(0)
        spn_Munic.setSelection(0)
        rb_Masculino.isSelected=true
        rb_Masculino.isSelected=true
        tex_Telefono.setText("").toString()
    }
}