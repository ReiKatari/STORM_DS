package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.sqlite.CursorWrapper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();
    private static final Builder zaf = new zab(new String[0], null);
    final int zaa;
    Bundle zab;
    int[] zac;
    int zad;
    boolean zae;
    private final String[] zag;
    private final CursorWindow[] zah;
    private final int zai;
    private final Bundle zaj;
    private boolean zak;

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DataHolder(Cursor cursor, int i, Bundle bundle) {
        this(r8, (CursorWindow[]) r1.toArray(new CursorWindow[r1.size()]), i, bundle);
        int i2;
        CursorWrapper cursorWrapper = new CursorWrapper(cursor);
        String[] columnNames = cursorWrapper.getColumnNames();
        ArrayList arrayList = new ArrayList();
        try {
            int count = cursorWrapper.getCount();
            CursorWindow window = cursorWrapper.getWindow();
            if (window != null && window.getStartPosition() == 0) {
                window.acquireReference();
                cursorWrapper.setWindow(null);
                arrayList.add(window);
                i2 = window.getNumRows();
            } else {
                i2 = 0;
            }
            while (i2 < count) {
                if (!cursorWrapper.moveToPosition(i2)) {
                    break;
                }
                CursorWindow window2 = cursorWrapper.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    cursorWrapper.setWindow(null);
                } else {
                    window2 = new CursorWindow(false);
                    window2.setStartPosition(i2);
                    cursorWrapper.fillWindow(i2, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                i2 = window2.getStartPosition() + window2.getNumRows();
            }
            cursorWrapper.close();
        } catch (Throwable th) {
            cursorWrapper.close();
            throw th;
        }
    }

    public static Builder builder(String[] strArr) {
        return new Builder(strArr, null, null);
    }

    public static DataHolder empty(int i) {
        return new DataHolder(zaf, i, (Bundle) null);
    }

    private final void zae(String str, int i) {
        Bundle bundle = this.zab;
        if (bundle != null && bundle.containsKey(str)) {
            if (!isClosed()) {
                if (i >= 0 && i < this.zad) {
                    return;
                }
                throw new CursorIndexOutOfBoundsException(i, this.zad);
            }
            i.h("Buffer is closed.");
            return;
        }
        i.h("No such column: ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0136, code lost:
        if (r5 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0138, code lost:
        android.util.Log.d("DataHolder", "Couldn't populate window data for row " + r4 + " - allocating new window.");
        r2.freeLastRow();
        r2 = new android.database.CursorWindow(false);
        r2.setStartPosition(r4);
        r2.setNumColumns(r13.zaa.length);
        r3.add(r2);
        r4 = r4 - 1;
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016a, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0174, code lost:
        throw new com.google.android.gms.common.data.zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static CursorWindow[] zaf(Builder builder, int i) {
        long j;
        if (builder.zaa.length != 0) {
            ArrayList arrayList = builder.zab;
            int size = arrayList.size();
            CursorWindow cursorWindow = new CursorWindow(false);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(cursorWindow);
            cursorWindow.setNumColumns(builder.zaa.length);
            int i2 = 0;
            boolean z = false;
            while (i2 < size) {
                try {
                    if (!cursorWindow.allocRow()) {
                        Log.d("DataHolder", "Allocating additional cursor window for large data set (row " + i2 + ")");
                        cursorWindow = new CursorWindow(false);
                        cursorWindow.setStartPosition(i2);
                        cursorWindow.setNumColumns(builder.zaa.length);
                        arrayList2.add(cursorWindow);
                        if (!cursorWindow.allocRow()) {
                            Log.e("DataHolder", "Unable to allocate row to hold data.");
                            arrayList2.remove(cursorWindow);
                            return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                        }
                    }
                    Map map = (Map) arrayList.get(i2);
                    int i3 = 0;
                    boolean z2 = true;
                    while (true) {
                        if (i3 < builder.zaa.length) {
                            if (!z2) {
                                break;
                            }
                            String str = builder.zaa[i3];
                            Object obj = map.get(str);
                            if (obj == null) {
                                z2 = cursorWindow.putNull(i2, i3);
                            } else if (obj instanceof String) {
                                z2 = cursorWindow.putString((String) obj, i2, i3);
                            } else if (obj instanceof Long) {
                                z2 = cursorWindow.putLong(((Long) obj).longValue(), i2, i3);
                            } else if (obj instanceof Integer) {
                                z2 = cursorWindow.putLong(((Integer) obj).intValue(), i2, i3);
                            } else if (obj instanceof Boolean) {
                                if (true != ((Boolean) obj).booleanValue()) {
                                    j = 0;
                                } else {
                                    j = 1;
                                }
                                z2 = cursorWindow.putLong(j, i2, i3);
                            } else if (obj instanceof byte[]) {
                                z2 = cursorWindow.putBlob((byte[]) obj, i2, i3);
                            } else if (obj instanceof Double) {
                                z2 = cursorWindow.putDouble(((Double) obj).doubleValue(), i2, i3);
                            } else if (obj instanceof Float) {
                                z2 = cursorWindow.putDouble(((Float) obj).floatValue(), i2, i3);
                            } else {
                                throw new IllegalArgumentException("Unsupported object for column " + str + ": " + obj.toString());
                            }
                            i3++;
                        } else if (z2) {
                            z = false;
                        }
                    }
                } catch (RuntimeException e) {
                    int size2 = arrayList2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        ((CursorWindow) arrayList2.get(i4)).close();
                    }
                    throw e;
                }
            }
            return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
        }
        return new CursorWindow[0];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (!this.zae) {
                    this.zae = true;
                    int i = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.zah;
                        if (i >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i].close();
                        i++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() {
        try {
            if (this.zak && this.zah.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + obj + ")");
            }
        } finally {
            super.finalize();
        }
    }

    public boolean getBoolean(String str, int i, int i2) {
        zae(str, i);
        if (this.zah[i2].getLong(i, this.zab.getInt(str)) == 1) {
            return true;
        }
        return false;
    }

    public byte[] getByteArray(String str, int i, int i2) {
        zae(str, i);
        return this.zah[i2].getBlob(i, this.zab.getInt(str));
    }

    public int getCount() {
        return this.zad;
    }

    public int getInteger(String str, int i, int i2) {
        zae(str, i);
        return this.zah[i2].getInt(i, this.zab.getInt(str));
    }

    public long getLong(String str, int i, int i2) {
        zae(str, i);
        return this.zah[i2].getLong(i, this.zab.getInt(str));
    }

    public Bundle getMetadata() {
        return this.zaj;
    }

    public int getStatusCode() {
        return this.zai;
    }

    public String getString(String str, int i, int i2) {
        zae(str, i);
        return this.zah[i2].getString(i, this.zab.getInt(str));
    }

    public int getWindowIndex(int i) {
        boolean z;
        int length;
        int i2 = 0;
        if (i >= 0 && i < this.zad) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        while (true) {
            int[] iArr = this.zac;
            length = iArr.length;
            if (i2 >= length) {
                break;
            } else if (i < iArr[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        if (i2 == length) {
            return i2 - 1;
        }
        return i2;
    }

    public boolean hasColumn(String str) {
        return this.zab.containsKey(str);
    }

    public boolean hasNull(String str, int i, int i2) {
        zae(str, i);
        return this.zah[i2].isNull(i, this.zab.getInt(str));
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.zae;
        }
        return z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr = this.zag;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, strArr, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zah, i, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zaa);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if ((i & 1) != 0) {
            close();
        }
    }

    public final double zaa(String str, int i, int i2) {
        zae(str, i);
        return this.zah[i2].getDouble(i, this.zab.getInt(str));
    }

    public final float zab(String str, int i, int i2) {
        zae(str, i);
        return this.zah[i2].getFloat(i, this.zab.getInt(str));
    }

    public final void zac(String str, int i, int i2, CharArrayBuffer charArrayBuffer) {
        zae(str, i);
        this.zah[i2].copyStringToBuffer(i, this.zab.getInt(str), charArrayBuffer);
    }

    public final void zad() {
        this.zab = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.zag;
            if (i2 >= strArr.length) {
                break;
            }
            this.zab.putInt(strArr[i2], i2);
            i2++;
        }
        this.zac = new int[this.zah.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.zah;
            if (i < cursorWindowArr.length) {
                this.zac[i] = i3;
                i3 += this.zah[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.zad = i3;
                return;
            }
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Builder {
        private final String[] zaa;
        private final ArrayList zab = new ArrayList();
        private final HashMap zac = new HashMap();

        public /* synthetic */ Builder(String[] strArr, String str, zac zacVar) {
            this.zaa = (String[]) Preconditions.checkNotNull(strArr);
        }

        public DataHolder build(int i, Bundle bundle) {
            return new DataHolder(this, i, bundle);
        }

        public Builder withRow(ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap hashMap = new HashMap(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return zaa(hashMap);
        }

        public Builder zaa(HashMap hashMap) {
            Asserts.checkNotNull(hashMap);
            this.zab.add(hashMap);
            return this;
        }

        public DataHolder build(int i) {
            return new DataHolder(this, i);
        }
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = i;
        this.zag = strArr;
        this.zah = cursorWindowArr;
        this.zai = i2;
        this.zaj = bundle;
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i, Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = 1;
        this.zag = (String[]) Preconditions.checkNotNull(strArr);
        this.zah = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.zai = i;
        this.zaj = bundle;
        zad();
    }

    private DataHolder(Builder builder, int i, Bundle bundle) {
        this(builder.zaa, zaf(builder, -1), i, (Bundle) null);
    }
}
