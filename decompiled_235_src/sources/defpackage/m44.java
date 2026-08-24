package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import android.util.TypedValue;
import android.view.Surface;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m44  reason: default package */
/* loaded from: classes.dex */
public final class m44 implements ye4, g36, b51, so2, qb7 {
    public static m44 X;
    public final /* synthetic */ int A;
    public final Object B;
    public Object L;
    public Object R;

    public m44(int i, byte b) {
        this.A = i;
        switch (i) {
            case 6:
                long[] jArr = b66.a;
                this.B = new ja4();
                return;
            case 19:
                this.B = new AtomicReference(nw7.d0);
                this.L = new Object();
                return;
            case 28:
                this.B = new WeakHashMap();
                this.L = new WeakHashMap();
                this.R = new WeakHashMap();
                return;
            default:
                String uuid = UUID.randomUUID().toString();
                uuid.getClass();
                da0 da0Var = da0.R;
                this.B = xd5.o(uuid);
                this.L = l94.f;
                this.R = new ArrayList();
                return;
        }
    }

    public static m44 A(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new m44(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public static void G(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static void H(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static final void b(m44 m44Var, Network network, boolean z) {
        boolean z2;
        Network[] allNetworks = ((ConnectivityManager) m44Var.B).getAllNetworks();
        int length = allNetworks.length;
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (nb3.k(network2, network)) {
                z2 = z;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) m44Var.B).getNetworkCapabilities(network2);
                if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                z3 = true;
                break;
            }
            i++;
        }
        jx6 jx6Var = (jx6) m44Var.L;
        synchronized (jx6Var) {
            try {
                if (((pe5) jx6Var.A.get()) != null) {
                    jx6Var.X = z3;
                } else {
                    jx6Var.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ArrayList t(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(mv.a);
        arrayList2.add(mv.c);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Size size2 = (Size) obj;
            Rational rational = new Rational(size2.getWidth(), size2.getHeight());
            if (!arrayList2.contains(rational)) {
                int size3 = arrayList2.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size3) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        if (mv.a((Rational) obj2, size2)) {
                            break;
                        }
                    } else {
                        arrayList2.add(rational);
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    public static Rational v(int i, boolean z) {
        if (i != -1 && i != 0) {
            if (i != 1) {
                kj2.v("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i);
                return null;
            } else if (z) {
                return mv.c;
            } else {
                return mv.d;
            }
        } else if (z) {
            return mv.a;
        } else {
            return mv.b;
        }
    }

    public static HashMap y(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        ArrayList t = t(arrayList);
        int size = t.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = t.get(i2);
            i2++;
            hashMap.put((Rational) obj, new ArrayList());
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            Size size3 = (Size) obj2;
            for (Rational rational : hashMap.keySet()) {
                if (mv.a(rational, size3)) {
                    ((List) hashMap.get(rational)).add(size3);
                }
            }
        }
        return hashMap;
    }

    public void B(Activity activity, kv7 kv7Var) {
        WeakHashMap weakHashMap = (WeakHashMap) this.R;
        activity.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.L;
        reentrantLock.lock();
        try {
            if (kv7Var.equals((kv7) weakHashMap.get(activity))) {
                return;
            }
            kv7 kv7Var2 = (kv7) weakHashMap.put(activity, kv7Var);
            reentrantLock.unlock();
            Iterator it = ((zh6) ((s35) this.B).A).b.iterator();
            it.getClass();
            while (it.hasNext()) {
                yh6 yh6Var = (yh6) it.next();
                if (yh6Var.a.equals(activity)) {
                    yh6Var.d = kv7Var;
                    yh6Var.b.execute(new q64(6, yh6Var, kv7Var));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void C(st3 st3Var) {
        jc6 jc6Var = (jc6) this.R;
        if (jc6Var != null) {
            jc6Var.run();
        }
        jc6 jc6Var2 = new jc6((ku3) this.B, st3Var);
        this.R = jc6Var2;
        ((Handler) this.L).postAtFrontOfQueue(jc6Var2);
    }

    public void D() {
        ((TypedArray) this.L).recycle();
    }

    public void E(y54 y54Var) {
        Object obj;
        ArrayList arrayList = (ArrayList) this.R;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = arrayList.get(i);
                i++;
                if (((y54) obj).a() == y54Var.a()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj == null) {
            arrayList.add(y54Var);
            return;
        }
        throw new Exception(lb1.k("Migration from version ", y54Var.a(), " already exists"));
    }

    public void F(Object obj) {
        long s = kj2.s();
        if (s == s57.a) {
            this.R = obj;
            return;
        }
        synchronized (this.L) {
            o57 o57Var = (o57) ((AtomicReference) this.B).get();
            int a = o57Var.a(s);
            if (a < 0) {
                ((AtomicReference) this.B).set(o57Var.b(s, obj));
            } else {
                o57Var.c[a] = obj;
            }
        }
    }

    public void I() {
        ja4 ja4Var = (ja4) this.B;
        String str = (String) this.L;
        List list = (List) ja4Var.k(str);
        if (list != null) {
            list.remove((on2) this.R);
        }
        if (list != null && !list.isEmpty()) {
            ja4Var.m(str, list);
        }
    }

    @Override // defpackage.ye4
    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.B;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // defpackage.g36
    public Object apply(Object obj) {
        int i;
        c42 c42Var;
        Object obj2;
        String str;
        i36 i36Var;
        boolean z;
        c42 c42Var2;
        long insert;
        boolean z2;
        byte[] bArr;
        int i2 = this.A;
        String str2 = "bytes";
        int i3 = 1;
        ?? r5 = 0;
        Object obj3 = null;
        i36 i36Var2 = (i36) this.B;
        switch (i2) {
            case 11:
                ArrayList arrayList = (ArrayList) this.L;
                fz fzVar = (fz) this.R;
                Cursor cursor = (Cursor) obj;
                c42 c42Var3 = i36.X;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(r5);
                    if (cursor.getInt(7) != 0) {
                        i = i3;
                    } else {
                        i = r5;
                    }
                    pa paVar = new pa(4, (boolean) r5);
                    paVar.Z = new HashMap();
                    String string = cursor.getString(i3);
                    if (string != null) {
                        paVar.B = string;
                        paVar.X = Long.valueOf(cursor.getLong(2));
                        paVar.Y = Long.valueOf(cursor.getLong(3));
                        if (i != 0) {
                            String string2 = cursor.getString(4);
                            if (string2 == null) {
                                c42Var2 = i36.X;
                            } else {
                                c42Var2 = new c42(string2);
                            }
                            paVar.R = new w32(c42Var2, cursor.getBlob(5));
                            str = str2;
                            i36Var = i36Var2;
                            z = r5;
                            obj2 = obj3;
                        } else {
                            String string3 = cursor.getString(4);
                            if (string3 == null) {
                                c42Var = i36.X;
                            } else {
                                c42Var = new c42(string3);
                            }
                            Cursor query = i36Var2.e().query("event_payloads", new String[]{str2}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                            try {
                                c42 c42Var4 = i36.X;
                                ArrayList arrayList2 = new ArrayList();
                                int i4 = r5;
                                while (query.moveToNext()) {
                                    byte[] blob = query.getBlob(r5);
                                    arrayList2.add(blob);
                                    i4 += blob.length;
                                }
                                byte[] bArr2 = new byte[i4];
                                int i5 = r5;
                                obj2 = obj3;
                                int i6 = i5;
                                while (i5 < arrayList2.size()) {
                                    byte[] bArr3 = (byte[]) arrayList2.get(i5);
                                    String str3 = str2;
                                    i36 i36Var3 = i36Var2;
                                    System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
                                    i6 += bArr3.length;
                                    i5++;
                                    str2 = str3;
                                    i36Var2 = i36Var3;
                                }
                                str = str2;
                                i36Var = i36Var2;
                                z = false;
                                query.close();
                                paVar.R = new w32(c42Var, bArr2);
                            } catch (Throwable th) {
                                query.close();
                                throw th;
                            }
                        }
                        if (!cursor.isNull(6)) {
                            paVar.L = Integer.valueOf(cursor.getInt(6));
                        }
                        arrayList.add(new ty(j, fzVar, paVar.f()));
                        r5 = z;
                        obj3 = obj2;
                        str2 = str;
                        i36Var2 = i36Var;
                        i3 = 1;
                    } else {
                        Object obj4 = obj3;
                        u34.x("Null transportName");
                        return obj4;
                    }
                }
                return obj3;
            default:
                fz fzVar2 = (fz) this.L;
                hy hyVar = (hy) this.R;
                w32 w32Var = hyVar.c;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                c42 c42Var5 = i36.X;
                long simpleQueryForLong = i36Var2.e().compileStatement("PRAGMA page_count").simpleQueryForLong();
                iy iyVar = i36Var2.R;
                if (i36Var2.e().compileStatement("PRAGMA page_size").simpleQueryForLong() * simpleQueryForLong >= iyVar.a) {
                    return -1L;
                }
                Long h = i36.h(sQLiteDatabase, fzVar2);
                if (h != null) {
                    insert = h.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", fzVar2.a);
                    contentValues.put("priority", Integer.valueOf(d35.a(fzVar2.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr4 = fzVar2.b;
                    if (bArr4 != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr4, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i7 = iyVar.e;
                byte[] bArr5 = w32Var.b;
                if (bArr5.length <= i7) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", hyVar.a);
                contentValues2.put("timestamp_ms", Long.valueOf(hyVar.d));
                contentValues2.put("uptime_ms", Long.valueOf(hyVar.e));
                contentValues2.put("payload_encoding", w32Var.a.a);
                contentValues2.put("code", hyVar.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z2));
                if (z2) {
                    bArr = bArr5;
                } else {
                    bArr = new byte[0];
                }
                contentValues2.put("payload", bArr);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z2) {
                    int ceil = (int) Math.ceil(bArr5.length / i7);
                    while (i3 <= ceil) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr5, (i3 - 1) * i7, Math.min(i3 * i7, bArr5.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i3));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                        i3++;
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(hyVar.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
        }
    }

    public void c(b1 b1Var) {
        HashSet hashSet = (HashSet) this.R;
        ArrayList arrayList = (ArrayList) this.L;
        if (!arrayList.contains(b1Var)) {
            if (!hashSet.contains(b1Var)) {
                hashSet.add(b1Var);
                b1Var.a(this);
                hashSet.remove(b1Var);
                if (!arrayList.contains(b1Var)) {
                    if (m51.class.isAssignableFrom(b1Var.getClass())) {
                        arrayList.add(0, b1Var);
                        return;
                    } else {
                        arrayList.add(b1Var);
                        return;
                    }
                }
                return;
            }
            e41.y(hashSet, "Cyclic dependency chain found: ");
        }
    }

    public void d(qv6 qv6Var, Map.Entry entry) {
        eg0 eg0Var;
        qv6 qv6Var2 = (qv6) entry.getValue();
        kj2.t("SurfaceProcessorNode", "     -> outputEdge = " + qv6Var2);
        Size size = qv6Var.g.a;
        Rect rect = ((ry) entry.getKey()).d;
        if (qv6Var.c) {
            eg0Var = (eg0) this.L;
        } else {
            eg0Var = null;
        }
        zy zyVar = new zy(size, rect, eg0Var, ((ry) entry.getKey()).f, ((ry) entry.getKey()).g);
        int i = ((ry) entry.getKey()).c;
        qv6Var2.getClass();
        nj2.h();
        qv6Var2.a();
        np2.A("Consumer can only be linked once.", !qv6Var2.j);
        qv6Var2.j = true;
        pv6 pv6Var = qv6Var2.l;
        ll0 T = l.T(pv6Var.c(), new ov6(qv6Var2, pv6Var, i, zyVar, null), u24.x());
        T.a(u24.x(), new uo2(0, T, new rr6(this, qv6Var2)));
    }

    public Object e() {
        Object removeLast;
        synchronized (this.L) {
            removeLast = ((ArrayDeque) this.B).removeLast();
        }
        return removeLast;
    }

    public Object f() {
        long s = kj2.s();
        if (s == s57.a) {
            return this.R;
        }
        o57 o57Var = (o57) ((AtomicReference) this.B).get();
        int a = o57Var.a(s);
        if (a >= 0) {
            return o57Var.c[a];
        }
        return null;
    }

    public ColorStateList g(int i) {
        int resourceId;
        ColorStateList A;
        TypedArray typedArray = (TypedArray) this.L;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (A = ge7.A((Context) this.B, resourceId)) != null) {
            return A;
        }
        return typedArray.getColorStateList(i);
    }

    @Override // defpackage.b51
    public Object h(Object obj) {
        String b = ((id3) ((s35) this.R).A).b((gg3) this.L, obj);
        int i = mk5.a;
        return jx2.q(b, (n34) this.B);
    }

    @Override // defpackage.so2
    public void i(Throwable th) {
        boolean z = th instanceof CancellationException;
        qb0 qb0Var = (qb0) this.L;
        if (z) {
            np2.A(null, qb0Var.c(new RuntimeException(((String) this.R).concat(" cancelled."), th)));
        } else {
            qb0Var.a(null);
        }
    }

    public long j() {
        PackageInfo packageInfo;
        Context context = (Context) this.B;
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        String packageName = context.getPackageName();
        packageName.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            packageInfo = a81.s(packageManager, packageName, a81.b(0L));
            packageInfo.getClass();
        } else {
            packageInfo = packageManager.getPackageInfo(packageName, 0);
            packageInfo.getClass();
        }
        if (i >= 28) {
            return pp.f(packageInfo);
        }
        return packageInfo.versionCode;
    }

    public Drawable k(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.L;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            return hf.S((Context) this.B, resourceId);
        }
        return typedArray.getDrawable(i);
    }

    public Drawable l(int i) {
        int resourceId;
        Drawable d;
        if (((TypedArray) this.L).hasValue(i) && (resourceId = ((TypedArray) this.L).getResourceId(i, 0)) != 0) {
            ir a = ir.a();
            Context context = (Context) this.B;
            synchronized (a) {
                d = a.a.d(context, resourceId, true);
            }
            return d;
        }
        return null;
    }

    public int m() {
        if (q().a.isEmpty()) {
            return -1;
        }
        long j = ((i34) gt0.H0(q().a)).a - q().h;
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    public Typeface n(int i, int i2, hs hsVar) {
        int resourceId = ((TypedArray) this.L).getResourceId(i, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.R) == null) {
                this.R = new TypedValue();
            }
            Context context = (Context) this.B;
            TypedValue typedValue = (TypedValue) this.R;
            ThreadLocal threadLocal = sl5.a;
            if (context.isRestricted()) {
                return null;
            }
            return sl5.b(context, resourceId, typedValue, i2, hsVar, true, false);
        }
        return null;
    }

    public boolean o() {
        return !q().a.isEmpty();
    }

    @Override // defpackage.so2, com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        Surface surface = (Surface) obj;
        l.J(true, (gx3) this.B, (qb0) this.L, u24.j());
    }

    public int p() {
        if (q().a.isEmpty()) {
            return -1;
        }
        long j = ((i34) gt0.Q0(q().a)).a + q().h;
        long w = w() - 1;
        if (j > w) {
            j = w;
        }
        return (int) j;
    }

    public cr4 q() {
        cr4 cr4Var = (cr4) this.L;
        if (cr4Var != null) {
            return cr4Var;
        }
        nb3.a0("layoutInfo");
        throw null;
    }

    public int r() {
        if (q().a.isEmpty()) {
            return 0;
        }
        return Math.abs(((((i34) gt0.Q0(q().a)).j + q().b) + q().c) - q().g);
    }

    public int s() {
        int i = 0;
        if (q().a.isEmpty()) {
            return 0;
        }
        int i2 = ((i34) gt0.H0(q().a)).j + (-q().f);
        if (i2 <= 0) {
            i = i2;
        }
        return Math.abs(i);
    }

    @Override // defpackage.ye4
    public void shutdown() {
        ((ConnectivityManager) this.B).unregisterNetworkCallback((c53) this.R);
    }

    public String toString() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 3:
                String str = (String) this.R;
                String str2 = (String) this.L;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) obj;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            case 10:
                List list = (List) this.L;
                StringBuilder sb2 = new StringBuilder("Request{");
                sb2.append((Uri) obj);
                if (list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            u34.a();
                            return null;
                        }
                        sb2.append(' ');
                        throw null;
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ce, code lost:
        if (defpackage.mj6.a(r5) < (r2.getHeight() * r2.getWidth())) goto L105;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList u(zi7 zi7Var) {
        ArrayList arrayList;
        Size[] sizeArr;
        List asList;
        boolean z;
        Rational rational;
        cg0 cg0Var = (cg0) this.B;
        n23 n23Var = (n23) zi7Var;
        List list = (List) n23Var.b(n23.x, null);
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            return arrayList;
        }
        el5 el5Var = (el5) n23Var.b(n23.w, null);
        List<Pair> list2 = (List) n23Var.b(n23.v, null);
        int q = zi7Var.q();
        if (list2 != null) {
            for (Pair pair : list2) {
                if (((Integer) pair.first).intValue() == q) {
                    sizeArr = (Size[]) pair.second;
                    break;
                }
            }
        }
        sizeArr = null;
        if (sizeArr == null) {
            asList = null;
        } else {
            asList = Arrays.asList(sizeArr);
        }
        if (asList == null) {
            asList = cg0Var.t(q);
        }
        ArrayList arrayList2 = new ArrayList(asList);
        Collections.sort(arrayList2, new ru0(true));
        if (arrayList2.isEmpty()) {
            kj2.f0("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + q + ".");
        }
        int i = 0;
        if (el5Var == null) {
            j50 j50Var = (j50) this.R;
            j50Var.getClass();
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            Collections.sort(arrayList3, new ru0(true));
            ArrayList arrayList4 = new ArrayList();
            n23 n23Var2 = (n23) zi7Var;
            Size size = (Size) n23Var2.b(n23.u, null);
            Size size2 = (Size) arrayList3.get(0);
            if (size != null) {
            }
            size = size2;
            Size a = j50Var.a(n23Var2);
            Size size3 = mj6.b;
            int a2 = mj6.a(size3);
            if (mj6.a(size) < a2) {
                size3 = mj6.a;
            } else if (a != null) {
                if (a.getHeight() * a.getWidth() < a2) {
                    size3 = a;
                }
            }
            int size4 = arrayList3.size();
            int i2 = 0;
            while (i2 < size4) {
                Object obj = arrayList3.get(i2);
                i2++;
                Size size5 = (Size) obj;
                if (mj6.a(size5) <= size.getHeight() * size.getWidth()) {
                    if (size5.getHeight() * size5.getWidth() >= mj6.a(size3) && !arrayList4.contains(size5)) {
                        arrayList4.add(size5);
                    }
                }
            }
            if (!arrayList4.isEmpty()) {
                xx xxVar = n23.o;
                if (n23Var2.i(xxVar)) {
                    rational = v(((Integer) n23Var2.e(xxVar)).intValue(), j50Var.c);
                } else {
                    Size a3 = j50Var.a(n23Var2);
                    if (a3 != null) {
                        ArrayList t = t(arrayList4);
                        int size6 = t.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 < size6) {
                                Object obj2 = t.get(i3);
                                i3++;
                                Rational rational2 = (Rational) obj2;
                                if (mv.a(rational2, a3)) {
                                    rational = rational2;
                                    break;
                                }
                            } else {
                                rational = new Rational(a3.getWidth(), a3.getHeight());
                                break;
                            }
                        }
                    } else {
                        rational = null;
                    }
                }
                if (a == null) {
                    a = (Size) n23Var2.b(n23.t, null);
                }
                ArrayList arrayList5 = new ArrayList();
                new HashMap();
                if (rational == null) {
                    arrayList5.addAll(arrayList4);
                    if (a != null) {
                        G(arrayList5, a, true);
                        return arrayList5;
                    }
                } else {
                    HashMap y = y(arrayList4);
                    if (a != null) {
                        for (Rational rational3 : y.keySet()) {
                            G((List) y.get(rational3), a, true);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(y.keySet());
                    Collections.sort(arrayList6, new lv(rational, (Rational) j50Var.d));
                    int size7 = arrayList6.size();
                    while (i < size7) {
                        Object obj3 = arrayList6.get(i);
                        i++;
                        for (Size size8 : (List) y.get((Rational) obj3)) {
                            if (!arrayList5.contains(size8)) {
                                arrayList5.add(size8);
                            }
                        }
                    }
                }
                return arrayList5;
            }
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size3 + "\nmaxSize = " + size + "\ninitial size list: " + arrayList3);
        }
        Size size9 = (Size) ((n23) zi7Var).b(n23.u, null);
        n23Var.K(0);
        if (!((Boolean) zi7Var.b(zi7.S, Boolean.FALSE)).booleanValue()) {
            zi7Var.q();
        }
        kj2.t("SupportedOutputSizesCollector", "useCaseConfig = " + zi7Var + ", candidateSizes = " + arrayList2);
        el5 el5Var2 = (el5) n23Var.e(n23.w);
        Rational rational4 = (Rational) this.L;
        cs1 cs1Var = el5Var2.a;
        HashMap y2 = y(arrayList2);
        if (rational4 == null || rational4.getNumerator() >= rational4.getDenominator()) {
            z = true;
        } else {
            z = false;
        }
        cs1Var.getClass();
        Rational v = v(0, z);
        ArrayList arrayList7 = new ArrayList(y2.keySet());
        Collections.sort(arrayList7, new lv(v, rational4));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size10 = arrayList7.size();
        int i4 = 0;
        while (i4 < size10) {
            Object obj4 = arrayList7.get(i4);
            i4++;
            Rational rational5 = (Rational) obj4;
            linkedHashMap.put(rational5, (List) y2.get(rational5));
        }
        if (size9 != null) {
            Size size11 = mj6.a;
            int height = size9.getHeight() * size9.getWidth();
            for (Rational rational6 : linkedHashMap.keySet()) {
                List<Size> list3 = (List) linkedHashMap.get(rational6);
                ArrayList arrayList8 = new ArrayList();
                for (Size size12 : list3) {
                    if (mj6.a(size12) <= height) {
                        arrayList8.add(size12);
                    }
                }
                list3.clear();
                list3.addAll(arrayList8);
            }
        }
        fl5 fl5Var = el5Var2.b;
        if (fl5Var != null) {
            for (Rational rational7 : linkedHashMap.keySet()) {
                List list4 = (List) linkedHashMap.get(rational7);
                if (!list4.isEmpty()) {
                    int i5 = fl5Var.b;
                    if (fl5Var != fl5.c) {
                        Size size13 = fl5Var.a;
                        if (i5 != 0) {
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    if (i5 != 3) {
                                        if (i5 == 4) {
                                            H(list4, size13, false);
                                        }
                                    } else {
                                        H(list4, size13, true);
                                    }
                                } else {
                                    G(list4, size13, false);
                                }
                            } else {
                                G(list4, size13, true);
                            }
                        } else {
                            boolean contains = list4.contains(size13);
                            list4.clear();
                            if (contains) {
                                list4.add(size13);
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList9 = new ArrayList();
        for (List<Size> list5 : linkedHashMap.values()) {
            for (Size size14 : list5) {
                if (!arrayList9.contains(size14)) {
                    arrayList9.add(size14);
                }
            }
        }
        return arrayList9;
    }

    public int w() {
        return ((Number) ((jr4) this.B).c()).intValue();
    }

    public rb7 x(c42 c42Var, q97 q97Var) {
        Set set = (Set) this.B;
        if (set.contains(c42Var)) {
            return new rb7((fz) this.L, c42Var, q97Var, (sb7) this.R);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c42Var, set));
    }

    public boolean z() {
        if (((pp6) this.B).getValue() == this.R) {
            m44 m44Var = (m44) this.L;
            if (m44Var == null || !m44Var.z()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public m44(Context context, SharedPreferences sharedPreferences) {
        this.A = 1;
        this.B = context;
        this.L = sharedPreferences;
        this.R = new ArrayList();
    }

    public m44(ArrayList arrayList) {
        this.A = 9;
        this.B = arrayList;
        this.L = new ArrayList(arrayList.size());
        this.R = new HashSet(3);
    }

    public m44(df5 df5Var) {
        this.A = 4;
        this.B = new AtomicInteger(0);
        this.L = new s9(2);
        this.R = new ci2(14, this, df5Var);
    }

    public m44(SystemForegroundService systemForegroundService) {
        this.A = 16;
        this.B = new ku3(systemForegroundService, true);
        this.L = new Handler(Looper.getMainLooper());
    }

    public m44(hp4 hp4Var) {
        this.A = 17;
        this.B = hp4Var;
        this.L = g04.t(1);
        this.R = g04.u(gs0.a);
    }

    public m44(int i) {
        this.A = 20;
        this.B = new long[i];
        this.L = new BitSet(i);
        this.R = new long[i];
    }

    public m44(fa6 fa6Var) {
        this.A = 29;
        this.L = new Object();
        this.B = new ArrayDeque(3);
        this.R = fa6Var;
    }

    public m44(jr4 jr4Var) {
        this.A = 5;
        this.B = jr4Var;
    }

    public m44(Context context, TypedArray typedArray) {
        this.A = 24;
        this.B = context;
        this.L = typedArray;
    }

    public m44(Runnable runnable) {
        this.A = 0;
        this.L = new CopyOnWriteArrayList();
        this.R = new HashMap();
        this.B = runnable;
    }

    public m44(Context context, LocationManager locationManager) {
        this.A = 26;
        this.R = new Object();
        this.B = context;
        this.L = locationManager;
    }

    public m44(ConnectivityManager connectivityManager, jx6 jx6Var) {
        this.A = 8;
        this.B = connectivityManager;
        this.L = jx6Var;
        c53 c53Var = new c53(this, 3);
        this.R = c53Var;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), c53Var);
    }

    public m44(cg0 cg0Var, Size size) {
        Rational rational;
        this.A = 21;
        this.B = cg0Var;
        cg0Var.b();
        cg0Var.m();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List t = cg0Var.t(256);
            if (t.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(t, new ru0(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.L = rational;
        this.R = new j50(cg0Var, rational);
    }

    public m44(eg0 eg0Var, qf1 qf1Var) {
        this.A = 22;
        this.L = eg0Var;
        this.B = qf1Var;
    }

    public m44(Uri uri, rw4 rw4Var) {
        this.A = 10;
        this.B = uri;
        this.L = null;
        this.R = rw4Var;
    }

    public m44(Class cls) {
        this.A = 7;
        this.B = new ConcurrentHashMap();
        this.R = cls;
    }

    public m44(ed3 ed3Var, fo2 fo2Var) {
        this.A = 14;
        this.B = ed3Var;
        this.L = fo2Var;
        this.R = gw0.L;
    }

    public m44(we7 we7Var, m44 m44Var) {
        this.A = 27;
        this.B = we7Var;
        this.L = m44Var;
        this.R = we7Var.getValue();
    }

    public /* synthetic */ m44(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }

    public m44(s35 s35Var) {
        this.A = 18;
        this.B = s35Var;
        this.L = new ReentrantLock();
        this.R = new WeakHashMap();
    }
}
