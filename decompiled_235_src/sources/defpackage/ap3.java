package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import me.magnum.melonds.ui.emulator.EmulatorSurfaceView;
import me.magnum.melonds.ui.emulator.render.FrameRenderCallback;
import me.magnum.melonds.ui.emulator.render.GlContext;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ap3  reason: default package */
/* loaded from: classes.dex */
public final class ap3 implements st6, f13, nb0, tj0, FrameRenderCallback, bo4, y05, ae4, at6, g36, j56 {
    public final /* synthetic */ int A;
    public Object B;
    public Object L;

    public ap3(int i) {
        this.A = i;
        switch (i) {
            case 7:
                this.B = new ja4();
                this.L = new ja4();
                return;
            case 10:
                this.B = new ua4(new sm3[16]);
                return;
            case 25:
                this.B = new LinkedHashMap();
                this.L = new LinkedHashMap();
                return;
            default:
                wc7 wc7Var = nw7.e0;
                Float valueOf = Float.valueOf((float) RecyclerView.B1);
                this.L = new uo(wc7Var, valueOf, (ap) wc7Var.a.g(valueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                return;
        }
    }

    public static void p(sm3 sm3Var) {
        if (sm3Var.J0 > 0) {
            if (sm3Var.C0.d == om3.Idle && !sm3Var.p() && !sm3Var.q() && !sm3Var.K0 && sm3Var.I()) {
                z64 z64Var = (z64) sm3Var.B0.g;
                if ((z64Var.R & 256) != 0) {
                    while (z64Var != null) {
                        if ((z64Var.L & 256) != 0) {
                            z64 z64Var2 = z64Var;
                            ua4 ua4Var = null;
                            while (z64Var2 != null) {
                                if (z64Var2 instanceof ks2) {
                                    ks2 ks2Var = (ks2) z64Var2;
                                    ks2Var.d0(nc1.d0(ks2Var, 256));
                                } else if ((z64Var2.L & 256) != 0 && (z64Var2 instanceof zg1)) {
                                    int i = 0;
                                    for (z64 z64Var3 = ((zg1) z64Var2).l0; z64Var3 != null; z64Var3 = z64Var3.Y) {
                                        if ((z64Var3.L & 256) != 0) {
                                            i++;
                                            if (i == 1) {
                                                z64Var2 = z64Var3;
                                            } else {
                                                if (ua4Var == null) {
                                                    ua4Var = new ua4(new z64[16]);
                                                }
                                                if (z64Var2 != null) {
                                                    ua4Var.b(z64Var2);
                                                    z64Var2 = null;
                                                }
                                                ua4Var.b(z64Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                z64Var2 = nc1.A(ua4Var);
                            }
                        }
                        if ((z64Var.R & 256) == 0) {
                            break;
                        }
                        z64Var = z64Var.Y;
                    }
                }
            }
            sm3Var.I0 = false;
            ua4 z = sm3Var.z();
            Object[] objArr = z.A;
            int i2 = z.L;
            for (int i3 = 0; i3 < i2; i3++) {
                p((sm3) objArr[i3]);
            }
        }
    }

    public static b62 r(z23 z23Var, Throwable th) {
        Drawable drawable;
        if (th instanceof eh4) {
            z23Var.getClass();
            we1 we1Var = z23Var.B;
            drawable = we1Var.l;
            we1 we1Var2 = h.a;
            if (drawable == null) {
                drawable = we1Var.k;
            }
        } else {
            drawable = z23Var.B.k;
            we1 we1Var3 = h.a;
        }
        return new b62(drawable, z23Var, th);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    @Override // defpackage.ae4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object H(long j, r41 r41Var) {
        l65 l65Var;
        int i;
        if (r41Var instanceof l65) {
            l65Var = (l65) r41Var;
            int i2 = l65Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l65Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = l65Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = l65Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    Float f = new Float(ol7.c(j));
                    l65Var.Y = 1;
                    obj = ((yv0) this.L).o(f, l65Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                return new ol7(qo2.k(RecyclerView.B1, ((Number) obj).floatValue()));
            }
        }
        l65Var = new l65(this, (s41) r41Var);
        Object obj2 = l65Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = l65Var.Y;
        if (i == 0) {
        }
        return new ol7(qo2.k(RecyclerView.B1, ((Number) obj2).floatValue()));
    }

    @Override // defpackage.ae4
    public long N(int i, long j) {
        if (i == 1) {
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i2) < RecyclerView.B1) {
                return (Float.floatToRawIntBits(RecyclerView.B1) << 32) | (Float.floatToRawIntBits(((Number) ((a0) this.B).g(Float.valueOf(Float.intBitsToFloat(i2)))).floatValue()) & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.at6
    public d44 a(c44 c44Var) {
        we5 we5Var = (we5) ((a01) this.L).h(c44Var);
        if (we5Var != null) {
            return new d44(we5Var.a, we5Var.b);
        }
        return null;
    }

    @Override // defpackage.g36
    public Object apply(Object obj) {
        i36 i36Var = (i36) this.B;
        fz fzVar = (fz) this.L;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        c42 c42Var = i36.X;
        i36Var.getClass();
        ArrayList arrayList = new ArrayList();
        Long h = i36.h(sQLiteDatabase, fzVar);
        if (h != null) {
            i36.u(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{h.toString()}, null, null, null, String.valueOf(i36Var.R.b)), new m44(i36Var, arrayList, fzVar, 11));
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(((ty) arrayList.get(i)).a);
            if (i < arrayList.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        i36.u(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new ng3(hashMap));
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            ty tyVar = (ty) listIterator.next();
            long j = tyVar.a;
            if (hashMap.containsKey(Long.valueOf(j))) {
                pa c = tyVar.c.c();
                for (h36 h36Var : (Set) hashMap.get(Long.valueOf(j))) {
                    c.b(h36Var.a, h36Var.b);
                }
                listIterator.set(new ty(j, tyVar.b, c.f()));
            }
        }
        return arrayList;
    }

    @Override // defpackage.at6
    public void b(int i) {
        int i2;
        a01 a01Var = (a01) this.L;
        if (i >= 40) {
            a01Var.p(-1);
        } else if (10 <= i && i < 20) {
            synchronized (((q61) a01Var.g)) {
                i2 = a01Var.c;
            }
            a01Var.p(i2 / 2);
        }
    }

    @Override // defpackage.j56
    public Object c(Object obj) {
        return ((qn2) this.L).g(obj);
    }

    @Override // defpackage.tj0
    public void cancel() {
        if (!((vw) this.L).compareAndSet(1, 1)) {
            ((u6) this.B).c();
        }
    }

    @Override // defpackage.st6
    public void d(rt6 rt6Var) {
        int i;
        y94 y94Var = (y94) this.L;
        y94Var.a();
        ea4 ea4Var = (ea4) rt6Var.B;
        Object[] objArr = ea4Var.b;
        long[] jArr = ea4Var.c;
        int i2 = ea4Var.e;
        while (i2 != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i2] >> 31) & 2147483647L);
            Object obj = objArr[i2];
            Object b = ((bq3) this.B).b(obj);
            int d = y94Var.d(b);
            if (d >= 0) {
                i = y94Var.c[d];
            } else {
                i = 0;
            }
            if (i == 7) {
                rt6Var.remove(obj);
            } else {
                y94Var.g(i + 1, b);
            }
            i2 = i3;
        }
    }

    @Override // defpackage.j56
    public Object e(n46 n46Var, Object obj) {
        return ((eo2) this.B).o(n46Var, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e0, code lost:
        if (r11 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ec, code lost:
        r9 = r5;
        r16 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0117, code lost:
        if (r13 == null) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(je5 je5Var, wl5 wl5Var) {
        in6 k;
        ui6 w;
        int intValue;
        int i;
        int i2;
        int i3;
        String str;
        switch (this.A) {
            case 9:
                mb0 mb0Var = (mb0) this.B;
                vk4 vk4Var = (vk4) this.L;
                try {
                    try {
                        mb0Var.c(vk4Var, vk4Var.c(wl5Var));
                        return;
                    } catch (Throwable th) {
                        ak7.H0(th);
                        th.printStackTrace();
                        return;
                    }
                } catch (Throwable th2) {
                    ak7.H0(th2);
                    try {
                        mb0Var.f(vk4Var, th2);
                        return;
                    } catch (Throwable th3) {
                        ak7.H0(th3);
                        th3.printStackTrace();
                        return;
                    }
                }
            default:
                try {
                    rm6 a = ((af5) this.B).a(wl5Var);
                    yw2 yw2Var = wl5Var.Y;
                    int size = yw2Var.size();
                    int i4 = 0;
                    int i5 = 0;
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    Integer num = null;
                    Integer num2 = null;
                    while (i5 < size) {
                        int i6 = 1;
                        if (yw2Var.b(i5).equalsIgnoreCase("Sec-WebSocket-Extensions")) {
                            String d = yw2Var.d(i5);
                            int i7 = i4;
                            z = z;
                            z2 = z2;
                            z3 = z3;
                            z4 = z4;
                            while (i7 < d.length()) {
                                yw2 yw2Var2 = yw2Var;
                                int g = yy7.g(d, ',', i7, i4, 4);
                                int e = yy7.e(d, ';', i7, g);
                                int j = yy7.j(i7, e, d);
                                String substring = d.substring(j, yy7.k(j, e, d));
                                i7 = e + 1;
                                boolean z5 = z4;
                                if (substring.equalsIgnoreCase("permessage-deflate")) {
                                    if (z) {
                                        z5 = i6;
                                    }
                                    while (i7 < g) {
                                        int e2 = yy7.e(d, ';', i7, g);
                                        int e3 = yy7.e(d, '=', i7, e2);
                                        int j2 = yy7.j(i7, e3, d);
                                        String substring2 = d.substring(j2, yy7.k(j2, e3, d));
                                        if (e3 < e2) {
                                            int j3 = yy7.j(e3 + 1, e2, d);
                                            str = d.substring(j3, yy7.k(j3, e2, d));
                                            i = g;
                                            i2 = size;
                                            if (str.length() >= 2) {
                                                if (xs6.g0(str, "\"", false) && qs6.l0(str, "\"")) {
                                                    i3 = i6;
                                                    str = str.substring(i3, str.length() - 1);
                                                } else {
                                                    i3 = i6;
                                                }
                                            } else {
                                                i3 = i6;
                                            }
                                        } else {
                                            i = g;
                                            i2 = size;
                                            i3 = i6;
                                            str = null;
                                        }
                                        int i8 = e2 + 1;
                                        z5 = z5;
                                        if (substring2.equalsIgnoreCase("client_max_window_bits")) {
                                            if (num != null) {
                                                z5 = i3;
                                            }
                                            if (str != null) {
                                                num = xs6.h0(str);
                                                break;
                                            } else {
                                                num = null;
                                                break;
                                            }
                                        } else {
                                            z5 = z5;
                                            if (substring2.equalsIgnoreCase("client_no_context_takeover")) {
                                                if (z2) {
                                                    z5 = i3;
                                                }
                                                if (str != null) {
                                                    z5 = i3;
                                                }
                                                i7 = i8;
                                                z2 = i3;
                                                i6 = z2 ? 1 : 0;
                                            } else {
                                                z5 = z5;
                                                if (substring2.equalsIgnoreCase("server_max_window_bits")) {
                                                    if (num2 != null) {
                                                        z5 = i3;
                                                    }
                                                    if (str != null) {
                                                        num2 = xs6.h0(str);
                                                        break;
                                                    } else {
                                                        num2 = null;
                                                        break;
                                                    }
                                                } else {
                                                    z5 = z5;
                                                    if (substring2.equalsIgnoreCase("server_no_context_takeover")) {
                                                        if (z3 != 0) {
                                                            z5 = i3;
                                                        }
                                                        if (str != null) {
                                                            z5 = i3;
                                                        }
                                                        i7 = i8;
                                                        z3 = i3;
                                                        i6 = z3 ? 1 : 0;
                                                    }
                                                }
                                                i7 = i8;
                                                z5 = i3;
                                                i6 = z5 == 1 ? 1 : 0;
                                            }
                                        }
                                        g = i;
                                        size = i2;
                                    }
                                    z = i6;
                                } else {
                                    z5 = i6;
                                }
                                yw2Var = yw2Var2;
                                i4 = 0;
                                z = z;
                                z2 = z2;
                                z3 = z3;
                                z4 = z5;
                            }
                        }
                        i5++;
                        i4 = i4;
                        yw2Var = yw2Var;
                        size = size;
                        z = z;
                        z2 = z2;
                        z3 = z3;
                        z4 = z4;
                    }
                    ((af5) this.B).d = new us7(z, num, z2, num2, z3, z4);
                    if (z4 || num != null || (num2 != null && (8 > (intValue = num2.intValue()) || intValue >= 16))) {
                        af5 af5Var = (af5) this.B;
                        synchronized (af5Var) {
                            af5Var.p.clear();
                            af5Var.b(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    String str2 = az7.b + " WebSocket " + ((i03) ((pa) this.L).B).g();
                    af5 af5Var2 = (af5) this.B;
                    bt btVar = new bt(a);
                    us7 us7Var = af5Var2.d;
                    us7Var.getClass();
                    synchronized (af5Var2) {
                        try {
                            af5Var2.m = str2;
                            af5Var2.n = btVar;
                            af5Var2.k = new xs7((ee5) btVar.R, af5Var2.b, us7Var.a, us7Var.c, af5Var2.e);
                            af5Var2.i = new hk1(af5Var2);
                            long j4 = af5Var2.c;
                            if (j4 != 0) {
                                long nanos = TimeUnit.MILLISECONDS.toNanos(j4);
                                pz6 pz6Var = af5Var2.l;
                                String concat = str2.concat(" ping");
                                jm jmVar = new jm(af5Var2, nanos, 1);
                                pz6Var.getClass();
                                pz6Var.c(new oz6(concat, jmVar), nanos);
                            }
                            if (!af5Var2.p.isEmpty()) {
                                af5Var2.e();
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    af5Var2.j = new ws7((fe5) btVar.L, af5Var2, us7Var.a, us7Var.e);
                    af5 af5Var3 = (af5) this.B;
                    try {
                        try {
                            af5Var3.a.f(af5Var3, wl5Var);
                            while (af5Var3.s == -1) {
                                ws7 ws7Var = af5Var3.j;
                                ws7Var.getClass();
                                ws7Var.e();
                            }
                        } finally {
                            af5Var3.d();
                        }
                    } catch (Exception e4) {
                        af5.c(af5Var3, e4, 6);
                    }
                    return;
                } catch (IOException e5) {
                    af5.c((af5) this.B, e5, 4);
                    yy7.b(wl5Var);
                    rm6 rm6Var = wl5Var.d0;
                    if (rm6Var != null && (w = rm6Var.w()) != null) {
                        yy7.b(w);
                    }
                    rm6 rm6Var2 = wl5Var.d0;
                    if (rm6Var2 != null && (k = rm6Var2.k()) != null) {
                        yy7.b(k);
                        return;
                    }
                    return;
                }
        }
    }

    @Override // defpackage.st6
    public boolean g(Object obj, Object obj2) {
        bq3 bq3Var = (bq3) this.B;
        return nb3.k(bq3Var.b(obj), bq3Var.b(obj2));
    }

    @Override // defpackage.at6
    public void h(c44 c44Var, Bitmap bitmap, Map map) {
        int i;
        int w = nb3.w(bitmap);
        a01 a01Var = (a01) this.L;
        synchronized (((q61) a01Var.g)) {
            i = a01Var.b;
        }
        a01 a01Var2 = (a01) this.L;
        if (w <= i) {
            a01Var2.l(c44Var, new we5(bitmap, map, w));
            return;
        }
        a01Var2.m(c44Var);
        ((rs7) this.B).g(c44Var, bitmap, map, w);
    }

    @Override // defpackage.y05
    public void i(Preference preference) {
        ((PreferenceGroup) this.B).Y = Integer.MAX_VALUE;
        t15 t15Var = (t15) this.L;
        Handler handler = t15Var.h;
        g15 g15Var = t15Var.i;
        handler.removeCallbacks(g15Var);
        handler.post(g15Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:3|(2:5|(8:7|8|9|(1:(1:(1:(3:14|15|16)(2:18|19))(5:20|21|22|23|24))(2:26|27))(3:36|37|(2:39|40))|28|(3:32|(2:34|35)|22)|23|24))|44|8|9|(0)(0)|28|(1:30)|32|(0)|22|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        r1.R = null;
        r1.X = null;
        r1.Y = null;
        r1.e0 = 3;
        r12 = r0.j(r9, r10, r11, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
        if (r12 == r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    @Override // defpackage.f13
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(String str, String str2, String str3, s41 s41Var) {
        aj5 aj5Var;
        Object obj;
        x61 x61Var;
        int i;
        String str4;
        switch (this.A) {
            case 3:
                xe1 xe1Var = xk1.a;
                return hv.d0(de1.L, new la(str, str2, this, str3, null, 6), s41Var);
            default:
                ng0 ng0Var = (ng0) this.L;
                if (s41Var instanceof aj5) {
                    aj5Var = (aj5) s41Var;
                    int i2 = aj5Var.e0;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        aj5Var.e0 = i2 - Integer.MIN_VALUE;
                        obj = aj5Var.Z;
                        x61Var = x61.COROUTINE_SUSPENDED;
                        i = aj5Var.e0;
                        if (i == 0) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3) {
                                        oi2.Y(obj);
                                        return (String) obj;
                                    }
                                    i.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                str3 = aj5Var.Y;
                                str2 = aj5Var.X;
                                str = aj5Var.R;
                                oi2.Y(obj);
                                str4 = (String) obj;
                                return str4;
                            }
                            str3 = aj5Var.Y;
                            str2 = aj5Var.X;
                            str = aj5Var.R;
                            oi2.Y(obj);
                        } else {
                            oi2.Y(obj);
                            aj5Var.R = str;
                            aj5Var.X = str2;
                            aj5Var.Y = str3;
                            aj5Var.e0 = 1;
                            obj = ((f13) this.B).j(str, str2, str3, aj5Var);
                            if (obj == x61Var) {
                                return x61Var;
                            }
                        }
                        str4 = (String) obj;
                        if (!qs6.v0(str4) || str4.equals(str)) {
                            aj5Var.R = str;
                            aj5Var.X = str2;
                            aj5Var.Y = str3;
                            aj5Var.e0 = 2;
                            obj = ng0Var.j(str, str2, str3, aj5Var);
                            if (obj == x61Var) {
                                return x61Var;
                            }
                            str4 = (String) obj;
                        }
                        return str4;
                    }
                }
                aj5Var = new aj5(this, s41Var);
                obj = aj5Var.Z;
                x61Var = x61.COROUTINE_SUSPENDED;
                i = aj5Var.e0;
                if (i == 0) {
                }
                str4 = (String) obj;
                if (!qs6.v0(str4)) {
                }
                aj5Var.R = str;
                aj5Var.X = str2;
                aj5Var.Y = str3;
                aj5Var.e0 = 2;
                obj = ng0Var.j(str, str2, str3, aj5Var);
                if (obj == x61Var) {
                }
                str4 = (String) obj;
                return str4;
        }
    }

    @Override // defpackage.nb0
    public void k(je5 je5Var, IOException iOException) {
        switch (this.A) {
            case 9:
                try {
                    ((mb0) this.B).f((vk4) this.L, iOException);
                    return;
                } catch (Throwable th) {
                    ak7.H0(th);
                    th.printStackTrace();
                    return;
                }
            default:
                af5.c((af5) this.B, iOException, 6);
                return;
        }
    }

    @Override // defpackage.bo4
    public List l(Integer num) {
        List l = ((bo4) this.B).l(null);
        pk6 pk6Var = (pk6) this.L;
        int i = pk6Var.v;
        if (i < 0) {
            return l;
        }
        return gt0.V0(ak7.J(pk6Var, num, i, Integer.valueOf(pk6Var.E(pk6Var.b, i))), l);
    }

    @Override // defpackage.bo4
    public boolean m() {
        return ((bo4) this.B).m();
    }

    public void n() {
        int[] iArr = (int[]) this.B;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.L = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r3 < r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o() {
        sm3[] sm3VarArr;
        ua4 ua4Var = (ua4) this.B;
        Arrays.sort(ua4Var.A, 0, ua4Var.L, zh2.d);
        int i = ua4Var.L;
        sm3[] sm3VarArr2 = (sm3[]) this.L;
        if (sm3VarArr2 != null) {
            int length = sm3VarArr2.length;
            sm3VarArr = sm3VarArr2;
        }
        sm3VarArr = new sm3[Math.max(16, i)];
        this.L = null;
        for (int i2 = 0; i2 < i; i2++) {
            sm3VarArr[i2] = ua4Var.A[i2];
        }
        ua4Var.g();
        while (true) {
            i--;
            if (-1 < i) {
                sm3 sm3Var = sm3VarArr[i];
                sm3Var.getClass();
                if (sm3Var.I0) {
                    p(sm3Var);
                }
                sm3VarArr[i] = null;
            } else {
                this.L = sm3VarArr;
                return;
            }
        }
    }

    public void q(int i) {
        int[] iArr = (int[]) this.B;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.B = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.B = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.B;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r9.a(r10) == false) goto L11;
     */
    @Override // me.magnum.melonds.ui.emulator.render.FrameRenderCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void renderFrame(boolean z, int i) {
        int i2;
        fx1 fx1Var;
        fx1 fx1Var2;
        long nanoTime = System.nanoTime();
        pm4 pm4Var = (pm4) this.B;
        e25 e25Var = pm4Var.c;
        e25Var.a = z;
        e25Var.b = i;
        ArrayList arrayList = pm4Var.e;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            EmulatorSurfaceView emulatorSurfaceView = (EmulatorSurfaceView) obj;
            GlContext glContext = pm4Var.a;
            e25 e25Var2 = pm4Var.c;
            emulatorSurfaceView.getClass();
            glContext.getClass();
            e25Var2.getClass();
            synchronized (emulatorSurfaceView.A) {
                EGLSurface eGLSurface = emulatorSurfaceView.e0;
                if (eGLSurface != null) {
                    if (emulatorSurfaceView.d0 == null) {
                        EGL14.eglDestroySurface(glContext.a, eGLSurface);
                        emulatorSurfaceView.e0 = null;
                    }
                    EGLSurface eGLSurface2 = emulatorSurfaceView.e0;
                    eGLSurface2.getClass();
                    glContext.c(eGLSurface2);
                    GLES20.glViewport(i3, i3, emulatorSurfaceView.getWidth(), emulatorSurfaceView.getHeight());
                    if (emulatorSurfaceView.R == EmulatorSurfaceView.a.UNINITIALIZED && (fx1Var2 = emulatorSurfaceView.f0) != null) {
                        ((c91) fx1Var2).c();
                        emulatorSurfaceView.R = EmulatorSurfaceView.a.DIRTY;
                    }
                    if (emulatorSurfaceView.R == EmulatorSurfaceView.a.DIRTY && (fx1Var = emulatorSurfaceView.f0) != null) {
                        int i5 = emulatorSurfaceView.B;
                        int i6 = emulatorSurfaceView.L;
                        c91 c91Var = (c91) fx1Var;
                        synchronized (c91Var.b) {
                            c91Var.A = i5;
                            c91Var.B = i6;
                            c91Var.d = true;
                        }
                        synchronized (c91Var.o) {
                            c91Var.e = true;
                        }
                        emulatorSurfaceView.R = EmulatorSurfaceView.a.READY;
                    }
                    fx1 fx1Var3 = emulatorSurfaceView.f0;
                    if (fx1Var3 != null) {
                        ((c91) fx1Var3).b(e25Var2);
                    }
                    EGLSurface eGLSurface3 = emulatorSurfaceView.e0;
                    eGLSurface3.getClass();
                    EGL14.eglSwapBuffers(glContext.a, eGLSurface3);
                }
            }
            i3 = 0;
        }
        long nanoTime2 = System.nanoTime() - nanoTime;
        w83 w83Var = ((nm4) this.L).R;
        int i7 = w83Var.B;
        if (i7 < 60) {
            w83Var.B = i7 + 1;
        }
        long j = w83Var.A;
        w83Var.A = ((j * (i2 - 1)) + nanoTime2) / w83Var.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory s(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.L) == null) {
            Context context = (Context) this.B;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.L = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.L = map;
        }
        String str4 = (String) ((Map) this.L).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        }
    }

    public void t(int i, int i2) {
        int[] iArr = (int[]) this.B;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            q(i3);
            int[] iArr2 = (int[]) this.B;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill((int[]) this.B, i, i3, -1);
            ArrayList arrayList = (ArrayList) this.L;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    xo6 xo6Var = (xo6) ((ArrayList) this.L).get(size);
                    int i4 = xo6Var.A;
                    if (i4 >= i) {
                        xo6Var.A = i4 + i2;
                    }
                }
            }
        }
    }

    public String toString() {
        switch (this.A) {
            case 17:
                String str = "[ ";
                if (((en6) this.B) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder s = lb1.s(str);
                        s.append(((en6) this.B).d0[i]);
                        s.append(" ");
                        str = s.toString();
                    }
                }
                StringBuilder r = i61.r(str, "] ");
                r.append((en6) this.B);
                return r.toString();
            default:
                return super.toString();
        }
    }

    public void u(int i, int i2) {
        int[] iArr = (int[]) this.B;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            q(i3);
            int[] iArr2 = (int[]) this.B;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = (int[]) this.B;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            ArrayList arrayList = (ArrayList) this.L;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    xo6 xo6Var = (xo6) ((ArrayList) this.L).get(size);
                    int i4 = xo6Var.A;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            ((ArrayList) this.L).remove(size);
                        } else {
                            xo6Var.A = i4 - i2;
                        }
                    }
                }
            }
        }
    }

    public fo4 v(z23 z23Var, wi6 wi6Var) {
        y56 y56Var;
        boolean z;
        List list = z23Var.h;
        Bitmap.Config config = z23Var.f;
        if ((!list.isEmpty() && !fv.o0(k.a, config)) || (nb3.B(config) && ((nb3.B(config) && !z23Var.m) || !((kw2) this.L).e(wi6Var)))) {
            config = Bitmap.Config.ARGB_8888;
        }
        ge7 ge7Var = wi6Var.a;
        qj1 qj1Var = qj1.m;
        if (!ge7Var.equals(qj1Var) && !wi6Var.b.equals(qj1Var)) {
            y56Var = z23Var.y;
        } else {
            y56Var = y56.FIT;
        }
        y56 y56Var2 = y56Var;
        if (z23Var.n && z23Var.h.isEmpty() && config != Bitmap.Config.ALPHA_8) {
            z = true;
        } else {
            z = false;
        }
        return new fo4(z23Var.a, config, null, wi6Var, y56Var2, h.a(z23Var), z, z23Var.o, null, z23Var.j, z23Var.k, z23Var.z, z23Var.p, z23Var.q, z23Var.r);
    }

    public void w() {
        ap6 ap6Var = (ap6) this.B;
        if (ap6Var != null) {
            ap6Var.h(null);
        }
        this.L = new uo(nw7.e0, Float.valueOf((float) RecyclerView.B1), null, 60);
    }

    @Override // defpackage.ae4
    public long w0(long j, long j2, int i) {
        if (i == 1) {
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) > RecyclerView.B1) {
                return (Float.floatToRawIntBits(((Number) ((a0) this.B).g(Float.valueOf(Float.intBitsToFloat(i2)))).floatValue()) & 4294967295L) | (Float.floatToRawIntBits(RecyclerView.B1) << 32);
            }
            return 0L;
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fo4 x(fo4 fo4Var) {
        boolean z;
        boolean z2;
        Bitmap.Config config = fo4Var.b;
        ra0 ra0Var = fo4Var.o;
        boolean z3 = true;
        if (nb3.B(config) && !((kw2) this.L).d()) {
            config = Bitmap.Config.ARGB_8888;
            z = true;
        } else {
            z = false;
        }
        Bitmap.Config config2 = config;
        if (fo4Var.o.getReadEnabled()) {
            jx6 jx6Var = (jx6) this.B;
            synchronized (jx6Var) {
                jx6Var.a();
                z2 = jx6Var.X;
            }
            if (!z2) {
                ra0Var = ra0.DISABLED;
                ra0 ra0Var2 = ra0Var;
                if (z3) {
                    return fo4Var;
                }
                return new fo4(fo4Var.a, config2, fo4Var.c, fo4Var.d, fo4Var.e, fo4Var.f, fo4Var.g, fo4Var.h, fo4Var.i, fo4Var.j, fo4Var.k, fo4Var.l, fo4Var.m, fo4Var.n, ra0Var2);
            }
        }
        z3 = z;
        ra0 ra0Var22 = ra0Var;
        if (z3) {
        }
    }

    public void y(float f, qh1 qh1Var, w61 w61Var) {
        qn2 qn2Var;
        if (f <= qh1Var.e0(1.0f)) {
            return;
        }
        vl6 t = ln2.t();
        if (t != null) {
            qn2Var = t.e();
        } else {
            qn2Var = null;
        }
        vl6 N = ln2.N(t);
        try {
            float floatValue = ((Number) ((uo) this.L).B.getValue()).floatValue();
            ap6 ap6Var = (ap6) this.B;
            if (ap6Var != null) {
                ap6Var.h(null);
            }
            uo uoVar = (uo) this.L;
            if (uoVar.Y) {
                this.L = ak7.O(uoVar, floatValue - f, RecyclerView.B1, 30);
            } else {
                this.L = new uo(nw7.e0, Float.valueOf(-f), null, 60);
            }
            this.B = hv.L(w61Var, null, null, new a6(this, null, 27), 3);
            ln2.V(t, N, qn2Var);
        } catch (Throwable th) {
            ln2.V(t, N, qn2Var);
            throw th;
        }
    }

    public /* synthetic */ ap3(int i, Object obj, Object obj2, boolean z) {
        this.A = i;
        this.L = obj;
        this.B = obj2;
    }

    public /* synthetic */ ap3(int i, boolean z) {
        this.A = i;
    }

    public ap3(pe5 pe5Var, jx6 jx6Var) {
        Object q33Var;
        this.A = 24;
        this.B = jx6Var;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            boolean z = c.a;
        } else if (!c.a) {
            if (i != 26 && i != 27) {
                q33Var = new q33(true);
            } else {
                q33Var = new jd1(13);
            }
            this.L = q33Var;
        }
        q33Var = new q33(false);
        this.L = q33Var;
    }

    public ap3(ue1 ue1Var, l4 l4Var, fr4 fr4Var) {
        this.A = 14;
        this.B = ue1Var;
        this.L = l4Var;
    }

    public ap3(u6 u6Var) {
        this.A = 11;
        this.B = u6Var;
        this.L = new AtomicInteger(0);
    }

    public ap3(c35 c35Var) {
        this.A = 17;
        this.L = c35Var;
    }

    public /* synthetic */ ap3(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }

    public ap3(xk4 xk4Var) {
        this.A = 3;
        xk4Var.getClass();
        this.B = xk4Var;
        this.L = hf.c0("https://lingva.ml", "https://lingva.thedaviddelta.com", "https://translate.plausibility.cloud");
    }

    public ap3(int i, rs7 rs7Var) {
        this.A = 20;
        this.B = rs7Var;
        this.L = new a01(i, this);
    }

    public ap3(Context context) {
        this.A = 5;
        this.L = null;
        this.B = context;
    }

    public ap3(bq3 bq3Var) {
        this.A = 1;
        this.B = bq3Var;
        y94 y94Var = th4.a;
        this.L = new y94();
    }

    public ap3(f13 f13Var) {
        this.A = 22;
        ng0 ng0Var = new ng0(2);
        this.B = f13Var;
        this.L = ng0Var;
    }
}
