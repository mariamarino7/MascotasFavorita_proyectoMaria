package com.mismascotasfavoritas.pojo;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.mismascotasfavoritas.basededatos.Conexiones;
import com.mismascotasfavoritas.basededatos.FuncionesBase;
import com.mismascotasfavoritas.R;

import java.util.ArrayList;



public class MascotaManager {


        private static final int CALIFICACIONES = 1;
        private static Context context;


        public MascotaManager(Context context) {
            this.context = context;
        }

        public ArrayList<Mascota> traeMascotas(){

            FuncionesBase db = new FuncionesBase(context);
            SQLiteDatabase database = db.getWritableDatabase();

            db.onUpgrade(database,1,1);

            insertarMascotas(db);
            return db.obtenerTodasMascotas();
        }

        public ArrayList<Mascota> obtenerFavorita(){
            FuncionesBase db = new FuncionesBase(context);
            return db.obtenerMascotasFavoritas();
        }

        public void insertarMascotas(FuncionesBase db){


            ContentValues contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_MASCOTA_NOMBRE, context.getString(R.string.Llama));
            contentValues.put(Conexiones.TABLA_MASCOTA_FOTO, R.drawable.llama);

            db.insertarMascota(contentValues);

            contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_ID_MASCOTA,1);
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_NUMERO_CALIFICACION,5);
            db.insertarCalificacionesMascota(contentValues);


            contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_MASCOTA_NOMBRE, context.getString(R.string.Conejo));
            contentValues.put(Conexiones.TABLA_MASCOTA_FOTO, R.drawable.conejo);
            db.insertarMascota(contentValues);


            contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_ID_MASCOTA,2);
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_NUMERO_CALIFICACION,15);
            db.insertarCalificacionesMascota(contentValues);


            contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_MASCOTA_NOMBRE, context.getString(R.string.Elefante));
            contentValues.put(Conexiones.TABLA_MASCOTA_FOTO, R.drawable.elefante);
            db.insertarMascota(contentValues);

            contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_ID_MASCOTA,3);
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_NUMERO_CALIFICACION,0);
            db.insertarCalificacionesMascota(contentValues);

            contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_MASCOTA_NOMBRE, context.getString(R.string.Panda));
            contentValues.put(Conexiones.TABLA_MASCOTA_FOTO, R.drawable.panda);
            db.insertarMascota(contentValues);

            contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_ID_MASCOTA,4);
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_NUMERO_CALIFICACION,25);
            db.insertarCalificacionesMascota(contentValues);


            contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_MASCOTA_NOMBRE, context.getString(R.string.Hipopotamo));
            contentValues.put(Conexiones.TABLA_MASCOTA_FOTO, R.drawable.hipopotamo);
            db.insertarMascota(contentValues);

            contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_ID_MASCOTA,5);
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_NUMERO_CALIFICACION,50);
            db.insertarCalificacionesMascota(contentValues);


            contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_MASCOTA_NOMBRE, context.getString(R.string.Koala));
            contentValues.put(Conexiones.TABLA_MASCOTA_FOTO, R.drawable.koala);
            db.insertarMascota(contentValues);

            contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_ID_MASCOTA,6);
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_NUMERO_CALIFICACION,0);
            db.insertarCalificacionesMascota(contentValues);


            contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_MASCOTA_NOMBRE, context.getString(R.string.Leon));
            contentValues.put(Conexiones.TABLA_MASCOTA_FOTO, R.drawable.leon);
            db.insertarMascota(contentValues);

            contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_ID_MASCOTA,7);
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_NUMERO_CALIFICACION,0);
            db.insertarCalificacionesMascota(contentValues);


            contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_MASCOTA_NOMBRE,context.getString(R.string.Oveja));
            contentValues.put(Conexiones.TABLA_MASCOTA_FOTO, R.drawable.oveja);
            db.insertarMascota(contentValues);

            contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_ID_MASCOTA,8);
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_NUMERO_CALIFICACION,3);
            db.insertarCalificacionesMascota(contentValues);


            contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_MASCOTA_NOMBRE,context.getString(R.string.Perro));
            contentValues.put(Conexiones.TABLA_MASCOTA_FOTO, R.drawable.perro);
            db.insertarMascota(contentValues);

            contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_ID_MASCOTA,9);
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_NUMERO_CALIFICACION,300);
            db.insertarCalificacionesMascota(contentValues);

            contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_MASCOTA_NOMBRE,context.getString(R.string.Pavo));
            contentValues.put(Conexiones.TABLA_MASCOTA_FOTO, R.drawable.pavoreal);
            db.insertarMascota(contentValues);


            contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_ID_MASCOTA,10);
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_NUMERO_CALIFICACION,0);
            db.insertarCalificacionesMascota(contentValues);


            contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_MASCOTA_NOMBRE,context.getString(R.string.Pinguino));
            contentValues.put(Conexiones.TABLA_MASCOTA_FOTO, R.drawable.pinguino);
            db.insertarMascota(contentValues);

            contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_ID_MASCOTA,11);
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_NUMERO_CALIFICACION,0);
            db.insertarCalificacionesMascota(contentValues);

            contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_MASCOTA_NOMBRE,context.getString(R.string.Vaca));
            contentValues.put(Conexiones.TABLA_MASCOTA_FOTO, R.drawable.vaca);
            db.insertarMascota(contentValues);

            contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_ID_MASCOTA,12);
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_NUMERO_CALIFICACION,8);
            db.insertarCalificacionesMascota(contentValues);

        }

        public void calificarMascota (Mascota mascota) {
            FuncionesBase db = new FuncionesBase(context);
            ContentValues contentValues = new ContentValues();
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_ID_MASCOTA, mascota.getId_mascota());
            contentValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_NUMERO_CALIFICACION, CALIFICACIONES);
            db.insertarCalificacionesMascota(contentValues);
        }

        public int obtenerCalificacion (Mascota mascota) {
            FuncionesBase db = new FuncionesBase(context);
            return db.obtenerCalificacionMascota(mascota);
        }

        public static void actualizarCalificacion(int id,int valor){
            ContentValues contenValues= new ContentValues();
            contenValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_ID_MASCOTA,id);
            contenValues.put(Conexiones.TABLA_CALIFICACION_MASCOTA_NUMERO_CALIFICACION,valor);
            FuncionesBase db = new FuncionesBase(context);
            db.actualizarCalificacion(contenValues);


        }






    }
