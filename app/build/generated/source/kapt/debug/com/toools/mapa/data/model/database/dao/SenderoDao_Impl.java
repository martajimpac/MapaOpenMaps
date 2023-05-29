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

import com.toools.mapa.data.database.dao.SenderoDao;
import com.toools.mapa.data.database.entities.SenderoEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class SenderoDao_Impl implements SenderoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SenderoEntity> __insertionAdapterOfSenderoEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteSendero;

  public SenderoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSenderoEntity = new EntityInsertionAdapter<SenderoEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `sendero_table` (`id`,`url`,`nombre`,`descripcion`,`estilo`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SenderoEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUrl());
        }
        if (value.getNombre() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNombre());
        }
        if (value.getDescripcion() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescripcion());
        }
        if (value.getEstilo() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getEstilo());
        }
      }
    };
    this.__preparedStmtOfDeleteSendero = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM sendero_table";
        return _query;
      }
    };
  }

  @Override
  public Object insertSendero(final SenderoEntity sendero,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSenderoEntity.insert(sendero);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteSendero(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteSendero.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteSendero.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object getSenderoById(final int id,
      final Continuation<? super SenderoEntity> continuation) {
    final String _sql = "SELECT * FROM sendero_table WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<SenderoEntity>() {
      @Override
      public SenderoEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfNombre = CursorUtil.getColumnIndexOrThrow(_cursor, "nombre");
          final int _cursorIndexOfDescripcion = CursorUtil.getColumnIndexOrThrow(_cursor, "descripcion");
          final int _cursorIndexOfEstilo = CursorUtil.getColumnIndexOrThrow(_cursor, "estilo");
          final SenderoEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpNombre;
            if (_cursor.isNull(_cursorIndexOfNombre)) {
              _tmpNombre = null;
            } else {
              _tmpNombre = _cursor.getString(_cursorIndexOfNombre);
            }
            final String _tmpDescripcion;
            if (_cursor.isNull(_cursorIndexOfDescripcion)) {
              _tmpDescripcion = null;
            } else {
              _tmpDescripcion = _cursor.getString(_cursorIndexOfDescripcion);
            }
            final String _tmpEstilo;
            if (_cursor.isNull(_cursorIndexOfEstilo)) {
              _tmpEstilo = null;
            } else {
              _tmpEstilo = _cursor.getString(_cursorIndexOfEstilo);
            }
            _result = new SenderoEntity(_tmpId,_tmpUrl,_tmpNombre,_tmpDescripcion,_tmpEstilo);
          } else {
            _result = null;
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
