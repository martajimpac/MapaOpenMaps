package com.toools.mapa.data.model.database.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;

import com.toools.mapa.data.database.dao.PuntoDao;
import com.toools.mapa.data.database.entities.PuntoEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class PuntoDao_Impl implements PuntoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PuntoEntity> __insertionAdapterOfPuntoEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllPuntos;

  public PuntoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPuntoEntity = new EntityInsertionAdapter<PuntoEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `punto_table` (`id`,`latitud`,`longitud`,`senderoId`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PuntoEntity value) {
        stmt.bindLong(1, value.getId());
        stmt.bindDouble(2, value.getLatitud());
        stmt.bindDouble(3, value.getLongitud());
        stmt.bindLong(4, value.getSenderoId());
      }
    };
    this.__preparedStmtOfDeleteAllPuntos = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM punto_table";
        return _query;
      }
    };
  }

  @Override
  public Object insertAllPuntos(final List<PuntoEntity> puntos,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPuntoEntity.insert(puntos);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteAllPuntos(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllPuntos.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllPuntos.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object getPuntosById(final int senderoId,
      final Continuation<? super List<PuntoEntity>> continuation) {
    final String _sql = "SELECT * FROM punto_table WHERE senderoId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, senderoId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<PuntoEntity>>() {
      @Override
      public List<PuntoEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfLatitud = CursorUtil.getColumnIndexOrThrow(_cursor, "latitud");
          final int _cursorIndexOfLongitud = CursorUtil.getColumnIndexOrThrow(_cursor, "longitud");
          final int _cursorIndexOfSenderoId = CursorUtil.getColumnIndexOrThrow(_cursor, "senderoId");
          final List<PuntoEntity> _result = new ArrayList<PuntoEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PuntoEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final double _tmpLatitud;
            _tmpLatitud = _cursor.getDouble(_cursorIndexOfLatitud);
            final double _tmpLongitud;
            _tmpLongitud = _cursor.getDouble(_cursorIndexOfLongitud);
            final int _tmpSenderoId;
            _tmpSenderoId = _cursor.getInt(_cursorIndexOfSenderoId);
            _item = new PuntoEntity(_tmpId,_tmpLatitud,_tmpLongitud,_tmpSenderoId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
