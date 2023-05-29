package com.toools.mapa.di

import android.content.Context
import androidx.room.Room
import com.toools.mapa.data.database.PuntoDatabase
import com.toools.mapa.data.database.SenderoDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    private const val SENDERO_DATABASE_NAME = "sendero_database"
    private const val PUNTO_DATABASE_NAME = "punto_database"

    @Singleton
    @Provides
    fun provideRoomSendero(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, SenderoDatabase::class.java, SENDERO_DATABASE_NAME).build()
    //se usa solo en provideSenderoDao
    @Singleton
    @Provides
    fun provideRoomPunto(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, PuntoDatabase::class.java, PUNTO_DATABASE_NAME).build()

    @Singleton
    @Provides
    fun provideSenderoDao(db: SenderoDatabase) = db.getSenderoDao()

    @Singleton
    @Provides
    fun providePuntoDao(db: PuntoDatabase) = db.getPuntoDao()
}