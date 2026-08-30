package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.domain.model.DSiWareTitle;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a53  reason: default package */
/* loaded from: classes.dex */
public abstract class a53 {
    public static Method m;
    public static boolean n;
    public static ax2 q;
    public static final ko a = new ko(Float.POSITIVE_INFINITY);
    public static final lo b = new lo(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final mo c = new mo(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final no d = new no(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final ko e = new ko(Float.NEGATIVE_INFINITY);
    public static final lo f = new lo(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final mo g = new mo(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final no h = new no(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final et0 i = new et0(1504001887, false, new xk0(22));
    public static final pj j = new pj(3);
    public static final boolean[] k = new boolean[3];
    public static final Object l = new Object();
    public static final long[] o = new long[0];
    public static final d96 p = new d96(25);

    public static final gv5 A(cm1 cm1Var) {
        cm1Var.getClass();
        int i2 = dm1.a[cm1Var.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return gv5.TOP;
                }
                i.c();
                return null;
            }
            return gv5.TOP;
        }
        return gv5.BOTTOM;
    }

    public static final boolean B(int i2, int i3) {
        if ((i2 & i3) == i3) {
            return true;
        }
        return false;
    }

    public static final zy3 C(zy3 zy3Var, mi2 mi2Var) {
        return zy3Var.f(new pc2(new sc2(mi2Var)));
    }

    public static g81 D(byte[] bArr) {
        boolean z;
        bArr.getClass();
        if (bArr.length <= 10240) {
            if (bArr.length == 0) {
                return g81.b;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                byte[] bArr2 = new byte[2];
                byteArrayInputStream.read(bArr2);
                int i2 = 0;
                if (bArr2[0] == -84 && bArr2[1] == -19) {
                    z = true;
                } else {
                    z = false;
                }
                byteArrayInputStream.reset();
                if (z) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int readInt = objectInputStream.readInt();
                        while (i2 < readInt) {
                            linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            i2++;
                        }
                        objectInputStream.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            dt3.W(objectInputStream, th);
                            throw th2;
                        }
                    }
                } else {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        short readShort = dataInputStream.readShort();
                        if (readShort == -21521) {
                            short readShort2 = dataInputStream.readShort();
                            if (readShort2 != 1) {
                                c44.e(wh1.g(readShort2, "Unsupported version number: "));
                            }
                        } else {
                            c44.e(wh1.g(readShort, "Magic number doesn't match: "));
                        }
                        int readInt2 = dataInputStream.readInt();
                        while (i2 < readInt2) {
                            linkedHashMap.put(dataInputStream.readUTF(), E(dataInputStream, dataInputStream.readByte()));
                            i2++;
                        }
                        dataInputStream.close();
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            dt3.W(dataInputStream, th3);
                            throw th4;
                        }
                    }
                }
            } catch (IOException e2) {
                y70.f().e(j81.a, "Error in Data#fromByteArray: ", e2);
            } catch (ClassNotFoundException e3) {
                y70.f().e(j81.a, "Error in Data#fromByteArray: ", e3);
            }
            return new g81(linkedHashMap);
        }
        i.n("Data cannot occupy more than 10240 bytes when serialized");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Float[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Integer[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Boolean[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.String[], java.io.Serializable] */
    public static final Serializable E(DataInputStream dataInputStream, byte b2) {
        if (b2 == 0) {
            return null;
        }
        if (b2 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b2 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b2 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b2 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b2 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b2 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b2 == 7) {
            return dataInputStream.readUTF();
        }
        int i2 = 0;
        if (b2 == 8) {
            int readInt = dataInputStream.readInt();
            ?? r0 = new Boolean[readInt];
            while (i2 < readInt) {
                r0[i2] = Boolean.valueOf(dataInputStream.readBoolean());
                i2++;
            }
            return r0;
        } else if (b2 == 9) {
            int readInt2 = dataInputStream.readInt();
            ?? r02 = new Byte[readInt2];
            while (i2 < readInt2) {
                r02[i2] = Byte.valueOf(dataInputStream.readByte());
                i2++;
            }
            return r02;
        } else if (b2 == 10) {
            int readInt3 = dataInputStream.readInt();
            ?? r03 = new Integer[readInt3];
            while (i2 < readInt3) {
                r03[i2] = Integer.valueOf(dataInputStream.readInt());
                i2++;
            }
            return r03;
        } else if (b2 == 11) {
            int readInt4 = dataInputStream.readInt();
            ?? r04 = new Long[readInt4];
            while (i2 < readInt4) {
                r04[i2] = Long.valueOf(dataInputStream.readLong());
                i2++;
            }
            return r04;
        } else if (b2 == 12) {
            int readInt5 = dataInputStream.readInt();
            ?? r05 = new Float[readInt5];
            while (i2 < readInt5) {
                r05[i2] = Float.valueOf(dataInputStream.readFloat());
                i2++;
            }
            return r05;
        } else if (b2 == 13) {
            int readInt6 = dataInputStream.readInt();
            ?? r06 = new Double[readInt6];
            while (i2 < readInt6) {
                r06[i2] = Double.valueOf(dataInputStream.readDouble());
                i2++;
            }
            return r06;
        } else if (b2 == 14) {
            int readInt7 = dataInputStream.readInt();
            ?? r1 = new String[readInt7];
            while (i2 < readInt7) {
                String readUTF = dataInputStream.readUTF();
                if (b53.x(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    readUTF = null;
                }
                r1[i2] = readUTF;
                i2++;
            }
            return r1;
        } else {
            i.n(wh1.g(b2, "Unsupported type "));
            return null;
        }
    }

    public static vk0 F(sk0 sk0Var) {
        sk0Var.getClass();
        Long l2 = sk0Var.a;
        String str = sk0Var.b;
        ArrayList arrayList = sk0Var.c;
        ArrayList arrayList2 = new ArrayList(uq0.y0(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Cheat cheat = (Cheat) obj;
            cheat.getClass();
            arrayList2.add(new zl0(cheat.getId(), cheat.getCheatDatabaseId(), cheat.getName(), cheat.getDescription(), cheat.getCode(), cheat.getEnabled()));
        }
        return new vk0(l2, str, arrayList2);
    }

    public static final boolean G(iz5 iz5Var) {
        boolean z;
        Object g2 = iz5Var.d.A.g(mz5.K);
        Boolean bool = null;
        if (g2 == null) {
            g2 = null;
        }
        lv6 lv6Var = (lv6) g2;
        d24 d24Var = iz5Var.d.A;
        Object g3 = d24Var.g(mz5.z);
        if (g3 == null) {
            g3 = null;
        }
        og5 og5Var = (og5) g3;
        if (lv6Var != null) {
            z = true;
        } else {
            z = false;
        }
        Object g4 = d24Var.g(mz5.J);
        if (g4 != null) {
            bool = g4;
        }
        if (bool != null && (og5Var == null || og5Var.a != 4)) {
            return true;
        }
        return z;
    }

    public static final String H(iz5 iz5Var, Resources resources) {
        float f2;
        int m2;
        ez5 ez5Var = iz5Var.d;
        ez5 ez5Var2 = iz5Var.d;
        Object g2 = ez5Var.A.g(mz5.b);
        String str = null;
        if (g2 == null) {
            g2 = null;
        }
        d24 d24Var = ez5Var2.A;
        Object g3 = d24Var.g(mz5.K);
        if (g3 == null) {
            g3 = null;
        }
        lv6 lv6Var = (lv6) g3;
        Object g4 = d24Var.g(mz5.z);
        if (g4 == null) {
            g4 = null;
        }
        og5 og5Var = (og5) g4;
        String str2 = g2;
        if (lv6Var != null) {
            int i2 = le.a[lv6Var.ordinal()];
            str2 = g2;
            str2 = g2;
            if (i2 != 1) {
                if (i2 != 2) {
                    str2 = g2;
                    if (i2 == 3) {
                        if (g2 == null) {
                            str2 = resources.getString(R.string.indeterminate);
                        }
                    } else {
                        i.c();
                        return null;
                    }
                } else if (og5Var != null) {
                    str2 = g2;
                    str2 = g2;
                    if (og5Var.a == 2 && g2 == null) {
                        str2 = resources.getString(R.string.state_off);
                    }
                }
            } else if (og5Var != null) {
                str2 = g2;
                str2 = g2;
                if (og5Var.a == 2 && g2 == null) {
                    str2 = resources.getString(R.string.state_on);
                }
            }
        }
        Object g5 = d24Var.g(mz5.J);
        if (g5 == null) {
            g5 = null;
        }
        Boolean bool = (Boolean) g5;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((og5Var == null || og5Var.a != 4) && str2 == null) {
                if (booleanValue) {
                    str2 = resources.getString(R.string.selected);
                } else {
                    str2 = resources.getString(R.string.not_selected);
                }
            }
        }
        Object g6 = d24Var.g(mz5.c);
        if (g6 == null) {
            g6 = null;
        }
        su4 su4Var = (su4) g6;
        String str3 = str2;
        if (su4Var != null) {
            str3 = str2;
            str3 = str2;
            if (su4Var != su4.c) {
                if (str2 == null) {
                    op0 op0Var = su4Var.b;
                    float f3 = op0Var.b;
                    float f4 = op0Var.a;
                    if (f3 - f4 == RecyclerView.A1) {
                        f2 = 0.0f;
                    } else {
                        f2 = (su4Var.a - f4) / (f3 - f4);
                    }
                    if (f2 < RecyclerView.A1) {
                        f2 = 0.0f;
                    }
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                    if (f2 == RecyclerView.A1) {
                        m2 = 0;
                    } else if (f2 == 1.0f) {
                        m2 = 100;
                    } else {
                        m2 = io2.m(Math.round(f2 * 100.0f), 1, 99);
                    }
                    str3 = resources.getString(R.string.template_percent, Integer.valueOf(m2));
                }
            } else if (str2 == null) {
                str3 = resources.getString(R.string.in_progress);
            }
        }
        qz5 qz5Var = mz5.G;
        String str4 = str3;
        if (d24Var.c(qz5Var)) {
            d24 d24Var2 = new iz5(iz5Var.a, true, iz5Var.c, ez5Var2).k().A;
            Object g7 = d24Var2.g(mz5.a);
            if (g7 == null) {
                g7 = null;
            }
            Collection collection = (Collection) g7;
            if (collection == null || collection.isEmpty()) {
                Object g8 = d24Var2.g(mz5.C);
                if (g8 == null) {
                    g8 = null;
                }
                Collection collection2 = (Collection) g8;
                if (collection2 == null || collection2.isEmpty()) {
                    Object g9 = d24Var2.g(qz5Var);
                    if (g9 == null) {
                        g9 = null;
                    }
                    CharSequence charSequence = (CharSequence) g9;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(R.string.state_empty);
                    }
                }
            }
            str4 = str;
        }
        return str4;
    }

    public static final to I(iz5 iz5Var) {
        Object g2 = iz5Var.d.A.g(mz5.G);
        to toVar = null;
        if (g2 == null) {
            g2 = null;
        }
        to toVar2 = (to) g2;
        Object g3 = iz5Var.d.A.g(mz5.C);
        if (g3 == null) {
            g3 = null;
        }
        List list = (List) g3;
        if (list != null) {
            toVar = (to) tq0.M0(list);
        }
        if (toVar2 == null) {
            return toVar;
        }
        return toVar2;
    }

    public static final void J(sk2 sk2Var, aj2 aj2Var) {
        aj2Var.getClass();
        l07.q(2, aj2Var);
        aj2Var.j(sk2Var, 1);
    }

    public static boolean K(ec5 ec5Var, ka kaVar) {
        kaVar.getClass();
        int i2 = ec5Var.R;
        if (i2 != 200 && i2 != 410 && i2 != 414 && i2 != 501 && i2 != 203 && i2 != 204) {
            if (i2 != 307) {
                if (i2 != 308 && i2 != 404 && i2 != 405) {
                    switch (i2) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            String b2 = ec5Var.Y.b("Expires");
            if (b2 == null) {
                b2 = null;
            }
            if (b2 == null && ec5Var.d().c == -1 && !ec5Var.d().f && !ec5Var.d().e) {
                return false;
            }
        }
        if (!ec5Var.d().b && !kaVar.f().b) {
            return true;
        }
        return false;
    }

    public static boolean L(String str) {
        String str2 = Build.MANUFACTURER;
        str2.getClass();
        if (!str2.equalsIgnoreCase(str)) {
            String str3 = Build.BRAND;
            str3.getClass();
            if (!str3.equalsIgnoreCase(str)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final boolean M(KeyEvent keyEvent) {
        long w = hi2.w(keyEvent);
        int i2 = r93.X;
        if (!r93.a(w, r93.h) && !r93.a(w, r93.t) && !r93.a(w, r93.N) && !r93.a(w, r93.s)) {
            return false;
        }
        return true;
    }

    public static boolean N() {
        String str;
        if (Build.VERSION.SDK_INT >= 31) {
            str = Build.SOC_MANUFACTURER;
            if ("Spreadtrum".equalsIgnoreCase(str)) {
                return true;
            }
        }
        String str2 = Build.HARDWARE;
        str2.getClass();
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        if (!gh6.n0(lowerCase, "ums", false)) {
            if (L("Itel")) {
                String lowerCase2 = str2.toLowerCase(locale);
                lowerCase2.getClass();
                if (gh6.n0(lowerCase2, "sp", false)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(java.util.Collection r4, defpackage.j11 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.cy
            if (r0 == 0) goto L13
            r0 = r5
            cy r0 = (defpackage.cy) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            cy r0 = new cy
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            java.util.Iterator r4 = r0.R
            defpackage.me2.a0(r5)
            goto L39
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L30:
            defpackage.me2.a0(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L39:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L50
            java.lang.Object r5 = r4.next()
            c63 r5 = (defpackage.c63) r5
            r0.R = r4
            r0.Y = r3
            java.lang.Object r5 = r5.Z(r0)
            if (r5 != r1) goto L39
            return r1
        L50:
            o27 r4 = defpackage.o27.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a53.O(java.util.Collection, j11):java.lang.Object");
    }

    public static final kx6 P(ku0 ku0Var, String str, tu0 tu0Var, int i2, int i3) {
        boolean z;
        mi2 mi2Var;
        boolean z2;
        if ((i3 & 2) != 0) {
            str = null;
        }
        int i4 = (i2 & 14) ^ 6;
        boolean z3 = true;
        if ((i4 > 4 && ((sk2) tu0Var).f(ku0Var)) || (i2 & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        sk2 sk2Var = (sk2) tu0Var;
        Object L = sk2Var.L();
        Object obj = su0.a;
        if (z || L == obj) {
            ga6 z4 = io2.z();
            if (z4 != null) {
                mi2Var = z4.e();
            } else {
                mi2Var = null;
            }
            ga6 Y = io2.Y(z4);
            try {
                Object kx6Var = new kx6(ku0Var, null, str);
                io2.l0(z4, Y, mi2Var);
                sk2Var.h0(kx6Var);
                L = kx6Var;
            } catch (Throwable th) {
                io2.l0(z4, Y, mi2Var);
                throw th;
            }
        }
        kx6 kx6Var2 = (kx6) L;
        if (ku0Var instanceof by5) {
            sk2Var.X(-1357590553);
            Object L2 = sk2Var.L();
            if (L2 == obj) {
                L2 = l.A(sk2Var);
                sk2Var.h0(L2);
            }
            Object obj2 = (o31) L2;
            boolean h2 = sk2Var.h(obj2);
            if ((i4 > 4 && sk2Var.f(ku0Var)) || (i2 & 6) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z5 = h2 | z2;
            Object L3 = sk2Var.L();
            if (z5 || L3 == obj) {
                L3 = new zr4(23, ku0Var, obj2);
                sk2Var.h0(L3);
            }
            l.d(obj2, (mi2) L3, sk2Var);
            by5 by5Var = (by5) ku0Var;
            Object value = by5Var.c.getValue();
            Object value2 = by5Var.b.getValue();
            if ((i4 <= 4 || !sk2Var.f(ku0Var)) && (i2 & 6) != 4) {
                z3 = false;
            }
            Object L4 = sk2Var.L();
            if (z3 || L4 == obj) {
                L4 = new zw5(ku0Var, null, 10);
                sk2Var.h0(L4);
            }
            l.h(value, value2, (aj2) L4, sk2Var);
            sk2Var.p(false);
        } else {
            sk2Var.X(-1356604288);
            kx6Var2.a(ku0Var.h(), sk2Var, 0);
            sk2Var.p(false);
        }
        boolean f2 = sk2Var.f(kx6Var2);
        Object L5 = sk2Var.L();
        if (f2 || L5 == obj) {
            L5 = new mx6(kx6Var2, 0);
            sk2Var.h0(L5);
        }
        l.d(kx6Var2, (mi2) L5, sk2Var);
        return kx6Var2;
    }

    public static byte[] Q(g81 g81Var) {
        g81Var.getClass();
        HashMap hashMap = g81Var.a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeShort(-21521);
            dataOutputStream.writeShort(1);
            dataOutputStream.writeInt(hashMap.size());
            for (Map.Entry entry : hashMap.entrySet()) {
                R(dataOutputStream, (String) entry.getKey(), entry.getValue());
            }
            dataOutputStream.flush();
            if (dataOutputStream.size() <= 10240) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArray.getClass();
                return byteArray;
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e2) {
            y70.f().e(j81.a, "Error in Data#toByteArray: ", e2);
            return new byte[0];
        }
    }

    public static final void R(DataOutputStream dataOutputStream, String str, Object obj) {
        int i2;
        double d2;
        float f2;
        long j2;
        int i3;
        byte b2;
        boolean z;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            qo0 a2 = q75.a(objArr.getClass());
            if (a2.equals(q75.a(Boolean[].class))) {
                i2 = 8;
            } else if (a2.equals(q75.a(Byte[].class))) {
                i2 = 9;
            } else if (a2.equals(q75.a(Integer[].class))) {
                i2 = 10;
            } else if (a2.equals(q75.a(Long[].class))) {
                i2 = 11;
            } else if (a2.equals(q75.a(Float[].class))) {
                i2 = 12;
            } else if (a2.equals(q75.a(Double[].class))) {
                i2 = 13;
            } else if (a2.equals(q75.a(String[].class))) {
                i2 = 14;
            } else {
                f81.i(q75.a(objArr.getClass()).b(), "Unsupported value type ");
                return;
            }
            dataOutputStream.writeByte(i2);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                String str2 = null;
                Boolean bool = null;
                Byte b3 = null;
                Integer num = null;
                Long l2 = null;
                Float f3 = null;
                Double d3 = null;
                if (i2 == 8) {
                    if (obj2 instanceof Boolean) {
                        bool = (Boolean) obj2;
                    }
                    if (bool != null) {
                        z = bool.booleanValue();
                    } else {
                        z = false;
                    }
                    dataOutputStream.writeBoolean(z);
                } else if (i2 == 9) {
                    if (obj2 instanceof Byte) {
                        b3 = (Byte) obj2;
                    }
                    if (b3 != null) {
                        b2 = b3.byteValue();
                    } else {
                        b2 = 0;
                    }
                    dataOutputStream.writeByte(b2);
                } else if (i2 == 10) {
                    if (obj2 instanceof Integer) {
                        num = (Integer) obj2;
                    }
                    if (num != null) {
                        i3 = num.intValue();
                    } else {
                        i3 = 0;
                    }
                    dataOutputStream.writeInt(i3);
                } else if (i2 == 11) {
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    }
                    if (l2 != null) {
                        j2 = l2.longValue();
                    } else {
                        j2 = 0;
                    }
                    dataOutputStream.writeLong(j2);
                } else if (i2 == 12) {
                    if (obj2 instanceof Float) {
                        f3 = (Float) obj2;
                    }
                    if (f3 != null) {
                        f2 = f3.floatValue();
                    } else {
                        f2 = RecyclerView.A1;
                    }
                    dataOutputStream.writeFloat(f2);
                } else if (i2 == 13) {
                    if (obj2 instanceof Double) {
                        d3 = (Double) obj2;
                    }
                    if (d3 != null) {
                        d2 = d3.doubleValue();
                    } else {
                        d2 = 0.0d;
                    }
                    dataOutputStream.writeDouble(d2);
                } else if (i2 == 14) {
                    if (obj2 instanceof String) {
                        str2 = (String) obj2;
                    }
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        } else {
            f81.i(q75.a(obj.getClass()).c(), "Unsupported value type ");
            return;
        }
        dataOutputStream.writeUTF(str);
    }

    public static final String S(byte b2) {
        char[] cArr = l.a;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
    }

    public static final String T(int i2) {
        if (i2 == 0) {
            return "0";
        }
        char[] cArr = l.a;
        int i3 = 0;
        char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
        while (i3 < 8 && cArr2[i3] == '0') {
            i3++;
        }
        return gh6.c0(cArr2, i3, 8);
    }

    public static final void U(long j2, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j2);
        }
    }

    public static final kx6 V(Object obj, String str, tu0 tu0Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        sk2 sk2Var = (sk2) tu0Var;
        Object L = sk2Var.L();
        sn1 sn1Var = su0.a;
        if (L == sn1Var) {
            L = new kx6(new n24(obj), null, str);
            sk2Var.h0(L);
        }
        kx6 kx6Var = (kx6) L;
        kx6Var.a(obj, sk2Var, (i2 & 8) | 48 | (i2 & 14));
        Object L2 = sk2Var.L();
        if (L2 == sn1Var) {
            L2 = new mx6(kx6Var, 1);
            sk2Var.h0(L2);
        }
        l.d(kx6Var, (mi2) L2, sk2Var);
        return kx6Var;
    }

    public static final void a(zy3 zy3Var, u92 u92Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-2115049507);
        if (sk2Var.f(zy3Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (sk2Var.h(u92Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i6 & 1, z)) {
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = new v6();
                sk2Var.h0(L);
            }
            v6 v6Var = (v6) L;
            boolean h2 = sk2Var.h(u92Var) | sk2Var.h(v6Var);
            Object L2 = sk2Var.L();
            if (h2 || L2 == sn1Var) {
                L2 = new y(u92Var, v6Var, null, 2);
                sk2Var.h0(L2);
            }
            l.g(sk2Var, (aj2) L2, u92Var);
            boolean h3 = sk2Var.h(v6Var);
            Object L3 = sk2Var.L();
            if (h3 || L3 == sn1Var) {
                L3 = new j0(8, v6Var);
                sk2Var.h0(L3);
            }
            io2.b(zy3Var, null, null, null, null, null, false, null, (mi2) L3, sk2Var, i6 & 14, 510);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new w6(zy3Var, u92Var, i2, 1);
        }
    }

    public static final void b(hv1 hv1Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        hv1Var.getClass();
        o45 o45Var = hv1Var.G0;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1053005445);
        if (sk2Var.h(hv1Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i4 & 1, z)) {
            boolean f2 = sk2Var.f(hv1Var);
            Object L = sk2Var.L();
            if (f2 || L == su0.a) {
                L = se.I(new a7(o45Var, 1), new a7(hv1Var.O0, 0));
                sk2Var.h0(L);
            }
            u92 u92Var = (u92) L;
            wy3 wy3Var = wy3.a;
            zy3 m0 = mh7.m0(o76.c(wy3Var, 1.0f), mh7.p);
            j20 j20Var = y60.L;
            tv3 d2 = d50.d(j20Var, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, m0);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d2);
            oo2.S(sk2Var, mu0.e, l2);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            a(o76.m(y60.n0.i(wy3Var, j20Var), 3), o45Var, sk2Var, 0);
            h(o76.c(wy3Var, 1.0f), u92Var, sk2Var, 6);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new z5(i2, 1, hv1Var);
        }
    }

    public static um c(float f2) {
        return new um(Float.valueOf(f2), dt3.g0, Float.valueOf(0.01f), 8);
    }

    public static final gs0 d(Object obj) {
        gs0 gs0Var = new gs0();
        gs0Var.c0(obj);
        return gs0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x02a6, code lost:
        if (r13 == r12) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.zy3 r41, me.magnum.melonds.domain.model.DSiWareTitle r42, defpackage.ki2 r43, defpackage.mi2 r44, defpackage.mi2 r45, defpackage.ki2 r46, defpackage.tu0 r47, int r48) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a53.e(zy3, me.magnum.melonds.domain.model.DSiWareTitle, ki2, mi2, mi2, ki2, tu0, int):void");
    }

    public static final void f(m71 m71Var, boolean z, ki2 ki2Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        boolean z2;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1003493178);
        if (sk2Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i3 | i2;
        if (sk2Var.h(ki2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i6 = i5 | i4;
        if ((i6 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i6 & 1, z2)) {
            n40.h(m71Var.getFileName(), z, false, ki2Var, sk2Var, (i6 & 112) | ((i6 << 3) & 7168), 4);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new z51(m71Var, z, ki2Var, i2, 0);
        }
    }

    public static final void g(final DSiWareTitle dSiWareTitle, u51 u51Var, mi2 mi2Var, ki2 ki2Var, final mi2 mi2Var2, final mi2 mi2Var3, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1180761477);
        if ((i2 & 6) == 0) {
            if (sk2Var.h(dSiWareTitle)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var.d(u51Var.ordinal())) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(mi2Var)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (sk2Var.h(ki2Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i2 & 24576) == 0) {
            if (sk2Var.h(mi2Var2)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((196608 & i2) == 0) {
            if (sk2Var.h(mi2Var3)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        boolean z4 = true;
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            int i10 = a61.b[u51Var.ordinal()];
            if (i10 != 1) {
                sn1 sn1Var = su0.a;
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            sk2Var.X(-281074587);
                            String X = me2.X(sk2Var, R.string.dsiware_manager_export_data);
                            if ((i3 & 896) == 256) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            Object L = sk2Var.L();
                            if (z3 || L == sn1Var) {
                                L = new v51(3, mi2Var);
                                sk2Var.h0(L);
                            }
                            n40.g(X, (ki2) L, ct3.H0(-1041755996, new bj2() { // from class: y51
                                @Override // defpackage.bj2
                                public final Object i(Object obj, Object obj2, Object obj3) {
                                    boolean z5;
                                    int i11 = r1;
                                    o27 o27Var = o27.a;
                                    sn1 sn1Var2 = su0.a;
                                    mi2 mi2Var4 = mi2Var3;
                                    DSiWareTitle dSiWareTitle2 = dSiWareTitle;
                                    boolean z6 = false;
                                    mr0 mr0Var = (mr0) obj;
                                    tu0 tu0Var2 = (tu0) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    switch (i11) {
                                        case 0:
                                            mr0Var.getClass();
                                            if ((intValue & 17) != 16) {
                                                z6 = true;
                                            }
                                            sk2 sk2Var2 = (sk2) tu0Var2;
                                            if (sk2Var2.O(intValue & 1, z6)) {
                                                m71 m71Var = m71.PUBLIC_SAV;
                                                boolean hasPublicSavFile = dSiWareTitle2.hasPublicSavFile();
                                                boolean f2 = sk2Var2.f(mi2Var4);
                                                Object L2 = sk2Var2.L();
                                                if (f2 || L2 == sn1Var2) {
                                                    L2 = new v51(8, mi2Var4);
                                                    sk2Var2.h0(L2);
                                                }
                                                a53.f(m71Var, hasPublicSavFile, (ki2) L2, sk2Var2, 6);
                                                m71 m71Var2 = m71.PRIVATE_SAV;
                                                boolean hasPrivateSavFile = dSiWareTitle2.hasPrivateSavFile();
                                                boolean f3 = sk2Var2.f(mi2Var4);
                                                Object L3 = sk2Var2.L();
                                                if (f3 || L3 == sn1Var2) {
                                                    L3 = new v51(9, mi2Var4);
                                                    sk2Var2.h0(L3);
                                                }
                                                a53.f(m71Var2, hasPrivateSavFile, (ki2) L3, sk2Var2, 6);
                                                m71 m71Var3 = m71.BANNER_SAV;
                                                boolean hasBannerSavFile = dSiWareTitle2.hasBannerSavFile();
                                                boolean f4 = sk2Var2.f(mi2Var4);
                                                Object L4 = sk2Var2.L();
                                                if (f4 || L4 == sn1Var2) {
                                                    L4 = new v51(10, mi2Var4);
                                                    sk2Var2.h0(L4);
                                                }
                                                a53.f(m71Var3, hasBannerSavFile, (ki2) L4, sk2Var2, 6);
                                            } else {
                                                sk2Var2.R();
                                            }
                                            return o27Var;
                                        default:
                                            mr0Var.getClass();
                                            if ((intValue & 17) != 16) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            sk2 sk2Var3 = (sk2) tu0Var2;
                                            if (sk2Var3.O(intValue & 1, z5)) {
                                                m71 m71Var4 = m71.PUBLIC_SAV;
                                                boolean hasPublicSavFile2 = dSiWareTitle2.hasPublicSavFile();
                                                boolean f5 = sk2Var3.f(mi2Var4);
                                                Object L5 = sk2Var3.L();
                                                if (f5 || L5 == sn1Var2) {
                                                    L5 = new v51(0, mi2Var4);
                                                    sk2Var3.h0(L5);
                                                }
                                                a53.f(m71Var4, hasPublicSavFile2, (ki2) L5, sk2Var3, 6);
                                                m71 m71Var5 = m71.PRIVATE_SAV;
                                                boolean hasPrivateSavFile2 = dSiWareTitle2.hasPrivateSavFile();
                                                boolean f6 = sk2Var3.f(mi2Var4);
                                                Object L6 = sk2Var3.L();
                                                if (f6 || L6 == sn1Var2) {
                                                    L6 = new v51(4, mi2Var4);
                                                    sk2Var3.h0(L6);
                                                }
                                                a53.f(m71Var5, hasPrivateSavFile2, (ki2) L6, sk2Var3, 6);
                                                m71 m71Var6 = m71.BANNER_SAV;
                                                boolean hasBannerSavFile2 = dSiWareTitle2.hasBannerSavFile();
                                                boolean f7 = sk2Var3.f(mi2Var4);
                                                Object L7 = sk2Var3.L();
                                                if (f7 || L7 == sn1Var2) {
                                                    L7 = new v51(5, mi2Var4);
                                                    sk2Var3.h0(L7);
                                                }
                                                a53.f(m71Var6, hasBannerSavFile2, (ki2) L7, sk2Var3, 6);
                                            } else {
                                                sk2Var3.R();
                                            }
                                            return o27Var;
                                    }
                                }
                            }, sk2Var), sk2Var, RendererDebugBridge.CAPTURE_HEIGHT);
                            sk2Var.p(false);
                        } else {
                            throw ej6.d(sk2Var, -840402276, false);
                        }
                    } else {
                        sk2Var.X(-281754107);
                        String X2 = me2.X(sk2Var, R.string.dsiware_manager_import_data);
                        if ((i3 & 896) != 256) {
                            z4 = false;
                        }
                        Object L2 = sk2Var.L();
                        if (z4 || L2 == sn1Var) {
                            L2 = new v51(2, mi2Var);
                            sk2Var.h0(L2);
                        }
                        n40.g(X2, (ki2) L2, ct3.H0(-1305453021, new bj2() { // from class: y51
                            @Override // defpackage.bj2
                            public final Object i(Object obj, Object obj2, Object obj3) {
                                boolean z5;
                                int i11 = r1;
                                o27 o27Var = o27.a;
                                sn1 sn1Var2 = su0.a;
                                mi2 mi2Var4 = mi2Var2;
                                DSiWareTitle dSiWareTitle2 = dSiWareTitle;
                                boolean z6 = false;
                                mr0 mr0Var = (mr0) obj;
                                tu0 tu0Var2 = (tu0) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                switch (i11) {
                                    case 0:
                                        mr0Var.getClass();
                                        if ((intValue & 17) != 16) {
                                            z6 = true;
                                        }
                                        sk2 sk2Var2 = (sk2) tu0Var2;
                                        if (sk2Var2.O(intValue & 1, z6)) {
                                            m71 m71Var = m71.PUBLIC_SAV;
                                            boolean hasPublicSavFile = dSiWareTitle2.hasPublicSavFile();
                                            boolean f2 = sk2Var2.f(mi2Var4);
                                            Object L22 = sk2Var2.L();
                                            if (f2 || L22 == sn1Var2) {
                                                L22 = new v51(8, mi2Var4);
                                                sk2Var2.h0(L22);
                                            }
                                            a53.f(m71Var, hasPublicSavFile, (ki2) L22, sk2Var2, 6);
                                            m71 m71Var2 = m71.PRIVATE_SAV;
                                            boolean hasPrivateSavFile = dSiWareTitle2.hasPrivateSavFile();
                                            boolean f3 = sk2Var2.f(mi2Var4);
                                            Object L3 = sk2Var2.L();
                                            if (f3 || L3 == sn1Var2) {
                                                L3 = new v51(9, mi2Var4);
                                                sk2Var2.h0(L3);
                                            }
                                            a53.f(m71Var2, hasPrivateSavFile, (ki2) L3, sk2Var2, 6);
                                            m71 m71Var3 = m71.BANNER_SAV;
                                            boolean hasBannerSavFile = dSiWareTitle2.hasBannerSavFile();
                                            boolean f4 = sk2Var2.f(mi2Var4);
                                            Object L4 = sk2Var2.L();
                                            if (f4 || L4 == sn1Var2) {
                                                L4 = new v51(10, mi2Var4);
                                                sk2Var2.h0(L4);
                                            }
                                            a53.f(m71Var3, hasBannerSavFile, (ki2) L4, sk2Var2, 6);
                                        } else {
                                            sk2Var2.R();
                                        }
                                        return o27Var;
                                    default:
                                        mr0Var.getClass();
                                        if ((intValue & 17) != 16) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        sk2 sk2Var3 = (sk2) tu0Var2;
                                        if (sk2Var3.O(intValue & 1, z5)) {
                                            m71 m71Var4 = m71.PUBLIC_SAV;
                                            boolean hasPublicSavFile2 = dSiWareTitle2.hasPublicSavFile();
                                            boolean f5 = sk2Var3.f(mi2Var4);
                                            Object L5 = sk2Var3.L();
                                            if (f5 || L5 == sn1Var2) {
                                                L5 = new v51(0, mi2Var4);
                                                sk2Var3.h0(L5);
                                            }
                                            a53.f(m71Var4, hasPublicSavFile2, (ki2) L5, sk2Var3, 6);
                                            m71 m71Var5 = m71.PRIVATE_SAV;
                                            boolean hasPrivateSavFile2 = dSiWareTitle2.hasPrivateSavFile();
                                            boolean f6 = sk2Var3.f(mi2Var4);
                                            Object L6 = sk2Var3.L();
                                            if (f6 || L6 == sn1Var2) {
                                                L6 = new v51(4, mi2Var4);
                                                sk2Var3.h0(L6);
                                            }
                                            a53.f(m71Var5, hasPrivateSavFile2, (ki2) L6, sk2Var3, 6);
                                            m71 m71Var6 = m71.BANNER_SAV;
                                            boolean hasBannerSavFile2 = dSiWareTitle2.hasBannerSavFile();
                                            boolean f7 = sk2Var3.f(mi2Var4);
                                            Object L7 = sk2Var3.L();
                                            if (f7 || L7 == sn1Var2) {
                                                L7 = new v51(5, mi2Var4);
                                                sk2Var3.h0(L7);
                                            }
                                            a53.f(m71Var6, hasBannerSavFile2, (ki2) L7, sk2Var3, 6);
                                        } else {
                                            sk2Var3.R();
                                        }
                                        return o27Var;
                                }
                            }
                        }, sk2Var), sk2Var, RendererDebugBridge.CAPTURE_HEIGHT);
                        sk2Var.p(false);
                    }
                } else {
                    sk2Var.X(-282603724);
                    String name = dSiWareTitle.getName();
                    if ((i3 & 896) == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Object L3 = sk2Var.L();
                    if (z2 || L3 == sn1Var) {
                        L3 = new v51(1, mi2Var);
                        sk2Var.h0(L3);
                    }
                    n40.g(name, (ki2) L3, ct3.H0(-1569150046, new x51(mi2Var, ki2Var), sk2Var), sk2Var, RendererDebugBridge.CAPTURE_HEIGHT);
                    sk2Var.p(false);
                }
            } else {
                sk2Var.X(-282684200);
                sk2Var.p(false);
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new f5(dSiWareTitle, u51Var, mi2Var, ki2Var, mi2Var2, mi2Var3, i2);
        }
    }

    public static final void h(zy3 zy3Var, u92 u92Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        u92 u92Var2;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1273173056);
        if (sk2Var.h(u92Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i4 = i3 | i2;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i4 & 1, z)) {
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = me2.G(null);
                sk2Var.h0(L);
            }
            k24 k24Var = (k24) L;
            Object L2 = sk2Var.L();
            if (L2 == sn1Var) {
                L2 = new pj4(-1.0f);
                sk2Var.h0(L2);
            }
            pj4 pj4Var = (pj4) L2;
            Object L3 = sk2Var.L();
            if (L3 == sn1Var) {
                L3 = me2.G(null);
                sk2Var.h0(L3);
            }
            k24 k24Var2 = (k24) L3;
            boolean h2 = sk2Var.h(u92Var);
            Object L4 = sk2Var.L();
            if (!h2 && L4 != sn1Var) {
                u92Var2 = u92Var;
            } else {
                u92Var2 = u92Var;
                L4 = new a0(u92Var2, k24Var, pj4Var, (j11) null, 1);
                sk2Var.h0(L4);
            }
            l.g(sk2Var, (aj2) L4, u92Var2);
            tv3 d2 = d50.d(y60.L, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, zy3Var);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d2);
            oo2.S(sk2Var, mu0.e, l2);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            y60 y60Var = y60.n0;
            vq4 vq4Var = (vq4) k24Var.getValue();
            zy3 i5 = y60Var.i(wy3.a, y60.R);
            Object L5 = sk2Var.L();
            if (L5 == sn1Var) {
                L5 = new x(2, pj4Var, k24Var2);
                sk2Var.h0(L5);
            }
            zy3 Z = n40.Z(i5, (mi2) L5);
            Object L6 = sk2Var.L();
            if (L6 == sn1Var) {
                L6 = new j4(k24Var2, 3);
                sk2Var.h0(L6);
            }
            zy3 z2 = iq2.z(Z, (mi2) L6);
            if (vq4Var instanceof sq4) {
                sk2Var.X(4395501);
                w81.a(z2, ((sq4) vq4Var).a, sk2Var, 0);
                sk2Var.p(false);
            } else if (vq4Var instanceof uq4) {
                sk2Var.X(4617399);
                jk2.i(z2, ((uq4) vq4Var).a, sk2Var, 0);
                sk2Var.p(false);
            } else if (vq4Var instanceof tq4) {
                sk2Var.X(4827889);
                jk2.e(z2, ((tq4) vq4Var).a, sk2Var, 0);
                sk2Var.p(false);
            } else if (vq4Var == null) {
                sk2Var.X(5014447);
                sk2Var.p(false);
            } else {
                throw ej6.d(sk2Var, -1385333472, false);
            }
            sk2Var.p(true);
        } else {
            u92Var2 = u92Var;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new w6(zy3Var, u92Var2, i2, 0);
        }
    }

    public static final void i(kx6 kx6Var, gx6 gx6Var, Object obj, Object obj2, y72 y72Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        boolean h2;
        int i4;
        boolean h3;
        int i5;
        boolean h4;
        int i6;
        int i7;
        int i8;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(867041821);
        if ((i2 & 6) == 0) {
            if (sk2Var.f(kx6Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var.f(gx6Var)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if ((i2 & 512) == 0) {
                h4 = sk2Var.f(obj);
            } else {
                h4 = sk2Var.h(obj);
            }
            if (h4) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if ((i2 & 4096) == 0) {
                h3 = sk2Var.f(obj2);
            } else {
                h3 = sk2Var.h(obj2);
            }
            if (h3) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if ((32768 & i2) == 0) {
                h2 = sk2Var.f(y72Var);
            } else {
                h2 = sk2Var.h(y72Var);
            }
            if (h2) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            if (kx6Var.g()) {
                gx6Var.h(obj, obj2, y72Var);
            } else {
                gx6Var.i(obj2, y72Var);
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new r4(kx6Var, gx6Var, obj, obj2, y72Var, i2);
        }
    }

    public static final float j(long j2, long j3) {
        return Math.min(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final boolean k(iz5 iz5Var) {
        ez5 k2 = iz5Var.k();
        return !k2.A.c(mz5.j);
    }

    public static final boolean l(iz5 iz5Var, Resources resources) {
        boolean z;
        Object g2 = iz5Var.d.A.g(mz5.a);
        String str = null;
        if (g2 == null) {
            g2 = null;
        }
        List list = (List) g2;
        if (list != null) {
            str = (String) tq0.M0(list);
        }
        if (str == null && I(iz5Var) == null && H(iz5Var, resources) == null && !G(iz5Var)) {
            z = false;
        } else {
            z = true;
        }
        if (!w81.v(iz5Var) && (iz5Var.d.L || (iz5Var.q() && z))) {
            return true;
        }
        return false;
    }

    public static final boolean m(int i2, int i3, int i4, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static zy3 n(zy3 zy3Var, float f2) {
        if (ji1.a(f2, RecyclerView.A1) > 0) {
            ji1.a(f2, RecyclerView.A1);
        }
        return tq5.q(zy3Var, new p30(f2, f2, 0, true));
    }

    public static final void o(kh7 kh7Var, String str) {
        ui7 b2;
        WorkDatabase workDatabase = kh7Var.c;
        workDatabase.getClass();
        di7 w = workDatabase.w();
        vd1 r = workDatabase.r();
        ArrayList f0 = l07.f0(str);
        while (!f0.isEmpty()) {
            String str2 = (String) tq0.b1(f0);
            ih7 c2 = w.c(str2);
            if (c2 != ih7.SUCCEEDED && c2 != ih7.FAILED) {
                ((Number) mh7.X(w.a, false, true, new ok0(str2, 19))).intValue();
            }
            f0.addAll(r.a(str2));
        }
        ku4 ku4Var = kh7Var.f;
        ku4Var.getClass();
        synchronized (ku4Var.k) {
            y70 f2 = y70.f();
            String str3 = ku4.l;
            f2.b(str3, "Processor cancelling " + str);
            ku4Var.i.add(str);
            b2 = ku4Var.b(str);
        }
        ku4.d(str, b2, 1);
        for (zu5 zu5Var : kh7Var.e) {
            zu5Var.a(str);
        }
    }

    public static void p(hz0 hz0Var, ho3 ho3Var, gz0 gz0Var) {
        gz0Var.o = -1;
        cy0 cy0Var = gz0Var.M;
        cy0 cy0Var2 = gz0Var.L;
        cy0 cy0Var3 = gz0Var.J;
        cy0 cy0Var4 = gz0Var.K;
        cy0 cy0Var5 = gz0Var.I;
        gz0Var.p = -1;
        fz0 fz0Var = hz0Var.T[0];
        fz0 fz0Var2 = fz0.WRAP_CONTENT;
        if (fz0Var != fz0Var2 && gz0Var.T[0] == fz0.MATCH_PARENT) {
            int i2 = cy0Var5.g;
            int r = hz0Var.r() - cy0Var4.g;
            cy0Var5.i = ho3Var.k(cy0Var5);
            cy0Var4.i = ho3Var.k(cy0Var4);
            ho3Var.d(cy0Var5.i, i2);
            ho3Var.d(cy0Var4.i, r);
            gz0Var.o = 2;
            gz0Var.Z = i2;
            int i3 = r - i2;
            gz0Var.V = i3;
            int i4 = gz0Var.c0;
            if (i3 < i4) {
                gz0Var.V = i4;
            }
        }
        if (hz0Var.T[1] != fz0Var2 && gz0Var.T[1] == fz0.MATCH_PARENT) {
            int i5 = cy0Var3.g;
            int l2 = hz0Var.l() - cy0Var2.g;
            cy0Var3.i = ho3Var.k(cy0Var3);
            cy0Var2.i = ho3Var.k(cy0Var2);
            ho3Var.d(cy0Var3.i, i5);
            ho3Var.d(cy0Var2.i, l2);
            if (gz0Var.b0 > 0 || gz0Var.h0 == 8) {
                ob6 k2 = ho3Var.k(cy0Var);
                cy0Var.i = k2;
                ho3Var.d(k2, gz0Var.b0 + i5);
            }
            gz0Var.p = 2;
            gz0Var.a0 = i5;
            int i6 = l2 - i5;
            gz0Var.W = i6;
            int i7 = gz0Var.d0;
            if (i6 < i7) {
                gz0Var.W = i7;
            }
        }
    }

    public static final void q(long j2, long j3, long j4) {
        if ((j3 | j4) >= 0 && j3 <= j2 && j2 - j3 >= j4) {
            return;
        }
        StringBuilder q2 = wh1.q(j2, "size=", " offset=");
        q2.append(j3);
        q2.append(" byteCount=");
        q2.append(j4);
        throw new ArrayIndexOutOfBoundsException(q2.toString());
    }

    public static zy3 r(zy3 zy3Var, l14 l14Var, mg5 mg5Var, boolean z, og5 og5Var, ki2 ki2Var, int i2) {
        zy3 A;
        if ((i2 & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            og5Var = null;
        }
        og5 og5Var2 = og5Var;
        if (mg5Var != null) {
            A = new cp0(l14Var, mg5Var, false, z2, null, og5Var2, ki2Var);
        } else if (mg5Var == null) {
            A = new cp0(l14Var, null, false, z2, null, og5Var2, ki2Var);
        } else {
            wy3 wy3Var = wy3.a;
            if (l14Var != null) {
                A = gy2.a(wy3Var, l14Var, mg5Var).f(new cp0(l14Var, null, false, z2, null, og5Var2, ki2Var));
            } else {
                A = l07.A(wy3Var, new dp0(mg5Var, z2, og5Var2, ki2Var));
            }
        }
        return zy3Var.f(A);
    }

    public static zy3 s(zy3 zy3Var, boolean z, String str, ki2 ki2Var, int i2) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            str = null;
        }
        return zy3Var.f(new cp0(null, null, true, z2, str, null, ki2Var));
    }

    public static final zy3 t(zy3 zy3Var, y26 y26Var) {
        return tq5.s(zy3Var, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, y26Var, 518143);
    }

    public static final zy3 u(zy3 zy3Var) {
        return tq5.s(zy3Var, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, null, 520191);
    }

    public static zy3 v(zy3 zy3Var, l14 l14Var, boolean z, ki2 ki2Var, ki2 ki2Var2, int i2) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 64) != 0) {
            ki2Var = null;
        }
        return zy3Var.f(new qr0(ki2Var2, ki2Var, l14Var, z));
    }

    public static final kx6 w(kx6 kx6Var, Object obj, Object obj2, String str, tu0 tu0Var, int i2) {
        boolean z;
        int i3 = (i2 & 14) ^ 6;
        boolean z2 = true;
        if ((i3 > 4 && ((sk2) tu0Var).f(kx6Var)) || (i2 & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        sk2 sk2Var = (sk2) tu0Var;
        Object L = sk2Var.L();
        sn1 sn1Var = su0.a;
        if (z || L == sn1Var) {
            L = new kx6(new n24(obj), kx6Var, kx6Var.c + " > " + str);
            sk2Var.h0(L);
        }
        kx6 kx6Var2 = (kx6) L;
        if ((i3 <= 4 || !sk2Var.f(kx6Var)) && (i2 & 6) != 4) {
            z2 = false;
        }
        boolean f2 = sk2Var.f(kx6Var2) | z2;
        Object L2 = sk2Var.L();
        if (f2 || L2 == sn1Var) {
            L2 = new zr4(24, kx6Var, kx6Var2);
            sk2Var.h0(L2);
        }
        l.d(kx6Var2, (mi2) L2, sk2Var);
        if (kx6Var.g()) {
            kx6Var2.k(obj, obj2);
            return kx6Var2;
        }
        kx6Var2.p(obj2);
        kx6Var2.k.setValue(Boolean.FALSE);
        return kx6Var2;
    }

    public static final ax6 x(kx6 kx6Var, bz6 bz6Var, String str, tu0 tu0Var, int i2, int i3) {
        zw6 zw6Var;
        if ((i3 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean f2 = ((sk2) tu0Var).f(kx6Var);
        sk2 sk2Var = (sk2) tu0Var;
        Object L = sk2Var.L();
        sn1 sn1Var = su0.a;
        if (f2 || L == sn1Var) {
            L = new ax6(kx6Var, bz6Var, str);
            sk2Var.h0(L);
        }
        ax6 ax6Var = (ax6) L;
        boolean f3 = sk2Var.f(kx6Var) | sk2Var.h(ax6Var);
        Object L2 = sk2Var.L();
        if (f3 || L2 == sn1Var) {
            L2 = new zr4(25, kx6Var, ax6Var);
            sk2Var.h0(L2);
        }
        l.d(ax6Var, (mi2) L2, sk2Var);
        if (kx6Var.g() && (zw6Var = (zw6) ax6Var.b.getValue()) != null) {
            kx6 kx6Var2 = ax6Var.c;
            zw6Var.A.h(zw6Var.L.n(kx6Var2.f().a()), zw6Var.L.n(kx6Var2.f().c()), (y72) zw6Var.B.n(kx6Var2.f()));
        }
        return ax6Var;
    }

    public static final gx6 y(kx6 kx6Var, Object obj, Object obj2, y72 y72Var, bz6 bz6Var, tu0 tu0Var, int i2) {
        mi2 mi2Var;
        boolean f2 = ((sk2) tu0Var).f(kx6Var);
        sk2 sk2Var = (sk2) tu0Var;
        Object L = sk2Var.L();
        sn1 sn1Var = su0.a;
        if (f2 || L == sn1Var) {
            ga6 z = io2.z();
            if (z != null) {
                mi2Var = z.e();
            } else {
                mi2Var = null;
            }
            ga6 Y = io2.Y(z);
            try {
                oo ooVar = (oo) bz6Var.a.n(obj2);
                ooVar.d();
                gx6 gx6Var = new gx6(kx6Var, obj, ooVar, bz6Var);
                io2.l0(z, Y, mi2Var);
                sk2Var.h0(gx6Var);
                L = gx6Var;
            } catch (Throwable th) {
                io2.l0(z, Y, mi2Var);
                throw th;
            }
        }
        gx6 gx6Var2 = (gx6) L;
        i(kx6Var, gx6Var2, obj, obj2, y72Var, sk2Var, 0);
        boolean f3 = sk2Var.f(kx6Var) | sk2Var.f(gx6Var2);
        Object L2 = sk2Var.L();
        if (f3 || L2 == sn1Var) {
            L2 = new zr4(27, kx6Var, gx6Var2);
            sk2Var.h0(L2);
        }
        l.d(gx6Var2, (mi2) L2, sk2Var);
        return gx6Var2;
    }

    public static final gv5 z(cm1 cm1Var) {
        cm1Var.getClass();
        int i2 = dm1.a[cm1Var.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return gv5.TOP;
                }
                i.c();
                return null;
            }
            return gv5.BOTTOM;
        }
        return gv5.TOP;
    }
}
