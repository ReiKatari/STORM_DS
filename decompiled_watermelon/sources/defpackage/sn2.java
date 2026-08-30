package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sn2  reason: default package */
/* loaded from: classes.dex */
public abstract class sn2 {
    public static final /* synthetic */ int a = 0;
    public static ax2 b = null;
    public static final /* synthetic */ int c = 0;
    public static boolean d = true;
    public static Field e;
    public static boolean f;

    public static final y55 A(q9 q9Var) {
        return yf2.b(mb4.e(((mb4) ((tj4) q9Var.L).getValue()).a, ((mb4) ((tj4) q9Var.R).getValue()).a), ((i76) ((tj4) q9Var.B).getValue()).a);
    }

    public static final lr6 B(ez5 ez5Var) {
        mi2 mi2Var;
        ArrayList arrayList = new ArrayList();
        Object g = ez5Var.A.g(dz5.a);
        if (g == null) {
            g = null;
        }
        w1 w1Var = (w1) g;
        if (w1Var == null || (mi2Var = (mi2) w1Var.b) == null || !((Boolean) mi2Var.n(arrayList)).booleanValue()) {
            return null;
        }
        return (lr6) arrayList.get(0);
    }

    public static c17 D(tu0 tu0Var) {
        return (c17) ((sk2) tu0Var).j(d17.b);
    }

    public static final boolean E(String str) {
        str.getClass();
        if (!str.equals("POST") && !str.equals("PATCH") && !str.equals("PUT") && !str.equals("DELETE") && !str.equals("MOVE")) {
            return false;
        }
        return true;
    }

    public static final boolean F(bq6 bq6Var, boolean z) {
        rd3 c2;
        hm3 hm3Var = bq6Var.d;
        if (hm3Var != null && (c2 = hm3Var.c()) != null) {
            y55 R = jk2.R(c2);
            long l = bq6Var.l(z);
            float f2 = R.a;
            float f3 = R.c;
            float intBitsToFloat = Float.intBitsToFloat((int) (l >> 32));
            if (f2 <= intBitsToFloat && intBitsToFloat <= f3) {
                float f4 = R.b;
                float f5 = R.d;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (l & 4294967295L));
                if (f4 <= intBitsToFloat2 && intBitsToFloat2 <= f5) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean G(ar5 ar5Var) {
        long j = ar5Var.e;
        if ((j >>> 32) == (4294967295L & j) && j == ar5Var.f && j == ar5Var.g && j == ar5Var.h) {
            return true;
        }
        return false;
    }

    public static final String H(Collection collection) {
        return ah6.X(tq0.S0(collection, ",", null, null, null, 62)).concat(ah6.X(" }"));
    }

    public static final String I(Collection collection) {
        return ah6.X(tq0.S0(collection, ",", null, null, null, 62)).concat(ah6.X("},"));
    }

    public static c87 J(String str) {
        Object kc5Var;
        Object obj = null;
        if (str == null) {
            return null;
        }
        c87 c87Var = c87.Z;
        try {
            kc5Var = x(str);
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        if (!(kc5Var instanceof kc5)) {
            obj = kc5Var;
        }
        return (c87) obj;
    }

    public static final boolean K(String str) {
        str.getClass();
        if (!str.equals("GET") && !str.equals("HEAD")) {
            return true;
        }
        return false;
    }

    public static final zy3 L(zy3 zy3Var, float f2) {
        int i = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
        if (i == 0 && i == 0) {
            return zy3Var;
        }
        return tq5.s(zy3Var, f2, f2, RecyclerView.A1, null, 524284);
    }

    public static final void M(nm nmVar, int i) {
        Object obj;
        Iterator<T> it = nmVar.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((vf3) ((Map.Entry) obj).getKey()).B == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null && entry.getValue() != null) {
            c44.b();
        }
    }

    public static void N(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            zv6.a(view, charSequence);
            return;
        }
        bw6 bw6Var = bw6.f0;
        if (bw6Var != null && bw6Var.A == view) {
            bw6.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            bw6 bw6Var2 = bw6.g0;
            if (bw6Var2 != null && bw6Var2.A == view) {
                bw6Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new bw6(view, charSequence);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kt6] */
    public static final t13 P(InputStream inputStream) {
        inputStream.getClass();
        return new t13(inputStream, new Object());
    }

    public static final ec5 Q(ec5 ec5Var) {
        ec5Var.getClass();
        cc5 i = ec5Var.i();
        gc5 gc5Var = ec5Var.Z;
        i.g = new a37(gc5Var.i(), gc5Var.d());
        return i.a();
    }

    public static String R(rq2 rq2Var) {
        int i = lg6.a[rq2Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "HmacSha512";
                }
                throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + rq2Var);
            }
            return "HmacSha256";
        }
        return "HmacSha1";
    }

    public static final String S(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static x77 T(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        int hashCode = lowerCase.hashCode();
        if (hashCode != 0) {
            if (hashCode != 3633) {
                if (hashCode != 3020272) {
                    if (hashCode == 92909918 && lowerCase.equals("alpha")) {
                        return x77.ALPHA;
                    }
                } else if (lowerCase.equals("beta")) {
                    return x77.BETA;
                }
            } else if (lowerCase.equals("rc")) {
                return x77.RC;
            }
        } else if (lowerCase.equals("")) {
            return x77.FINAL;
        }
        i.i("Unknown release qualifier: ".concat(str));
        return null;
    }

    public static final void U(CaptureRequest.Builder builder, Object obj, Object obj2) {
        if (obj != null && (obj instanceof CaptureRequest.Key)) {
            try {
                builder.set((CaptureRequest.Key) obj, obj2);
            } catch (IllegalArgumentException e2) {
                Log.w("CXCP", "Failed to set [" + ((CaptureRequest.Key) obj).getName() + ": " + obj2 + "] on CaptureRequest.Builder", e2);
            }
        }
    }

    public static final void V(CaptureRequest.Builder builder, Map map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            U(builder, entry.getKey(), entry.getValue());
        }
    }

    public static final iz2 a(m93 m93Var, String str) {
        return new iz2(str, new jz2(m93Var));
    }

    public static final void b(UUID uuid, BackgroundMode backgroundMode, aj2 aj2Var, ki2 ki2Var, mi2 mi2Var, ki2 ki2Var2, ki2 ki2Var3, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        backgroundMode.getClass();
        aj2Var.getClass();
        ki2Var.getClass();
        mi2Var.getClass();
        ki2Var2.getClass();
        ki2Var3.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1099541442);
        if (sk2Var.h(uuid)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (sk2Var.d(backgroundMode.ordinal())) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (sk2Var.h(aj2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i11 = i10 | i4;
        if (sk2Var.h(ki2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (sk2Var.h(mi2Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (sk2Var.h(ki2Var2)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i14 = i13 | i7;
        if (sk2Var.h(ki2Var3)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i15 = i14 | i8;
        if ((599187 & i15) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i15 & 1, z)) {
            Object L = sk2Var.L();
            Object obj = su0.a;
            if (L == obj) {
                L = me2.G(null);
                sk2Var.h0(L);
            }
            k24 k24Var = (k24) L;
            k24 L2 = me2.L(aj2Var, sk2Var);
            boolean h = sk2Var.h(uuid) | sk2Var.f(L2);
            Object L3 = sk2Var.L();
            if (h || L3 == obj) {
                L3 = new m5(uuid, L2, k24Var, (j11) null);
                sk2Var.h0(L3);
            }
            l.g(sk2Var, (aj2) L3, uuid);
            mh7.a(me2.X(sk2Var, R.string.layout_background_title), ki2Var2, ct3.H0(62324307, new u3(ki2Var, me2.V(sk2Var, R.array.background_portrait_mode_options), backgroundMode, mi2Var, k24Var, 1), sk2Var), ct3.H0(882420181, new hl0(ki2Var2, ki2Var3, 1), sk2Var), false, sk2Var, ((i15 >> 12) & 112) | 3456, 16);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new xl0(uuid, backgroundMode, aj2Var, ki2Var, mi2Var, ki2Var2, ki2Var3, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v9, types: [ni3, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.zy3 r37, defpackage.pk3 r38, final defpackage.ih4 r39, final boolean r40, final defpackage.a92 r41, final boolean r42, final defpackage.eg r43, defpackage.h20 r44, defpackage.qt r45, defpackage.i20 r46, defpackage.nt r47, final defpackage.mi2 r48, defpackage.tu0 r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 1173
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn2.c(zy3, pk3, ih4, boolean, a92, boolean, eg, h20, qt, i20, nt, mi2, tu0, int, int, int):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kj7, java.lang.Object] */
    public static final kj7 d(long j) {
        int i = (int) j;
        int i2 = (int) (j >> 32);
        int i3 = ~i;
        ?? obj = new Object();
        obj.B = i;
        obj.L = i2;
        obj.R = 0;
        obj.X = 0;
        obj.Y = i3;
        obj.Z = (i << 10) ^ (i2 >>> 4);
        if ((i2 | i | i3) != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                obj.d();
            }
            return obj;
        }
        i.i("Initial state must have at least one non-zero element.");
        return null;
    }

    public static final ar5 e(float f2, float f3, float f4, float f5, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new ar5(f2, f3, f4, f5, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Type inference failed for: r6v0, types: [k75, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.dw5 r10, float r11, defpackage.io r12, defpackage.x81 r13, defpackage.mi2 r14, defpackage.k11 r15) {
        /*
            boolean r0 = r15 instanceof defpackage.da6
            if (r0 == 0) goto L13
            r0 = r15
            da6 r0 = (defpackage.da6) r0
            int r1 = r0.c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c0 = r1
            goto L18
        L13:
            da6 r0 = new da6
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.Z
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.c0
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            float r11 = r0.R
            k75 r10 = r0.Y
            io r12 = r0.X
            defpackage.me2.a0(r15)
            goto L69
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r10)
            r10 = 0
            return r10
        L34:
            defpackage.me2.a0(r15)
            k75 r6 = new k75
            r6.<init>()
            java.lang.Object r15 = r12.b()
            java.lang.Number r15 = (java.lang.Number) r15
            float r15 = r15.floatValue()
            r2 = 0
            int r15 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r15 != 0) goto L4d
            r15 = r3
            goto L4e
        L4d:
            r15 = 0
        L4e:
            r15 = r15 ^ r3
            ca6 r4 = new ca6
            r9 = 0
            r7 = r10
            r5 = r11
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r0.X = r12
            r0.Y = r6
            r0.R = r5
            r0.c0 = r3
            java.lang.Object r10 = defpackage.gk2.s(r12, r13, r15, r4, r0)
            if (r10 != r1) goto L67
            return r1
        L67:
            r11 = r5
            r10 = r6
        L69:
            eo r13 = new eo
            float r10 = r10.A
            float r11 = r11 - r10
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r11)
            r13.<init>(r10, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn2.f(dw5, float, io, x81, mi2, k11):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Type inference failed for: r12v0, types: [k75, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.dw5 r16, float r17, float r18, defpackage.io r19, defpackage.sc6 r20, defpackage.mi2 r21, defpackage.k11 r22) {
        /*
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof defpackage.ea6
            if (r2 == 0) goto L18
            r2 = r1
            ea6 r2 = (defpackage.ea6) r2
            int r3 = r2.d0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.d0 = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            ea6 r2 = new ea6
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.c0
            p31 r2 = defpackage.p31.COROUTINE_SUSPENDED
            int r3 = r8.d0
            r9 = 0
            r4 = 1
            if (r3 == 0) goto L3f
            if (r3 != r4) goto L38
            float r0 = r8.X
            float r2 = r8.R
            k75 r3 = r8.Z
            io r4 = r8.Y
            defpackage.me2.a0(r1)
            r1 = r0
            r0 = r2
            goto L90
        L38:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r0)
            r0 = 0
            return r0
        L3f:
            defpackage.me2.a0(r1)
            k75 r12 = new k75
            r12.<init>()
            java.lang.Object r1 = r19.b()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            java.lang.Object r5 = r19.b()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L66
            r5 = r4
            goto L67
        L66:
            r5 = 0
        L67:
            r6 = r5 ^ 1
            ca6 r10 = new ca6
            r15 = 1
            r13 = r16
            r11 = r18
            r14 = r21
            r10.<init>(r11, r12, r13, r14, r15)
            r5 = r3
            r3 = r19
            r8.Y = r3
            r8.Z = r12
            r8.R = r0
            r8.X = r1
            r8.d0 = r4
            r4 = r5
            r7 = r10
            r5 = r20
            java.lang.Object r4 = defpackage.gk2.t(r3, r4, r5, r6, r7, r8)
            if (r4 != r2) goto L8d
            return r2
        L8d:
            r4 = r19
            r3 = r12
        L90:
            java.lang.Object r2 = r4.b()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r1 = s(r2, r1)
            eo r2 = new eo
            float r3 = r3.A
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r0 = 29
            io r0 = defpackage.dt3.Z(r4, r9, r1, r0)
            r2.<init>(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn2.g(dw5, float, float, io, sc6, mi2, k11):java.lang.Object");
    }

    public static final y55 h(u36 u36Var, q36 q36Var) {
        if (q36Var != null) {
            List b2 = u36Var.b();
            int size = b2.size();
            for (int i = 0; i < size; i++) {
                if (b53.x(((w36) b2.get(i)).g0, q36Var)) {
                    if (q36Var.i0) {
                        if (!q36Var.k0) {
                            return q36Var.j0;
                        }
                        return yf2.b(rd3.s(q36Var.S0(), l.O(q36Var), 6), hk2.U(l.O(q36Var).L));
                    }
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static final void i(q9 q9Var, long j, long j2, long j3, boolean z) {
        tj4 tj4Var = (tj4) q9Var.L;
        tj4 tj4Var2 = (tj4) q9Var.X;
        tj4 tj4Var3 = (tj4) q9Var.B;
        tj4 tj4Var4 = (tj4) q9Var.R;
        if (!mb4.b(((mb4) tj4Var4.getValue()).a, j3) || !i76.b(((i76) tj4Var3.getValue()).a, j) || z) {
            tj4Var3.setValue(new i76(j));
            tj4Var4.setValue(new mb4(j3));
            if (z) {
                tj4Var.setValue(new mb4(mb4.d(mb4.d(j2, j3), mb4.d(((mb4) tj4Var2.getValue()).a, ((mb4) tj4Var.getValue()).a))));
            }
        }
        tj4Var2.setValue(new mb4(mb4.d(j2, j3)));
    }

    public static final void j(mz1 mz1Var) {
        qg6 qg6Var;
        mz1Var.getClass();
        if (mz1Var instanceof qg6) {
            qg6Var = (qg6) mz1Var;
        } else {
            qg6Var = null;
        }
        if (qg6Var != null) {
            return;
        }
        f81.A(q75.a(mz1Var.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
    }

    public static final void k(Preference preference, ur4 ur4Var) {
        preference.getClass();
        ur4 onPreferenceChangeListener = preference.getOnPreferenceChangeListener();
        if (onPreferenceChangeListener instanceof av0) {
            ((av0) onPreferenceChangeListener).a.add(ur4Var);
            return;
        }
        av0 av0Var = new av0();
        ArrayList arrayList = av0Var.a;
        if (onPreferenceChangeListener != null) {
            arrayList.add(onPreferenceChangeListener);
        }
        arrayList.add(ur4Var);
        preference.setOnPreferenceChangeListener(av0Var);
    }

    public static final void l(go goVar, dw5 dw5Var, mi2 mi2Var, float f2) {
        float f3;
        try {
            f3 = dw5Var.a(f2);
        } catch (CancellationException unused) {
            goVar.a();
            f3 = RecyclerView.A1;
        }
        mi2Var.n(Float.valueOf(f3));
        if (Math.abs(f2 - f3) > 0.5f) {
            goVar.a();
        }
    }

    public static final f73 m(b91 b91Var) {
        f73 f73Var;
        b91Var.getClass();
        if (b91Var instanceof f73) {
            f73Var = (f73) b91Var;
        } else {
            f73Var = null;
        }
        if (f73Var != null) {
            return f73Var;
        }
        f81.A(q75.a(b91Var.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    public static final r45 n(g76 g76Var) {
        g76Var.getClass();
        return new r45(g76Var);
    }

    public static final s45 o(sb6 sb6Var) {
        sb6Var.getClass();
        return new s45(sb6Var);
    }

    public static final void p(int i, int i2) {
        if (i >= 0 && i < i2) {
            return;
        }
        f81.q(wh1.f(i, i2, "index: ", ", size: "));
    }

    public static final void q(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return;
        }
        f81.q(wh1.f(i, i2, "index: ", ", size: "));
    }

    public static final void r(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            i.i(wh1.f(i, i2, "fromIndex: ", " > toIndex: "));
            return;
        }
        c44.p(b31.s(i, i2, "fromIndex: ", ", toIndex: ", ", size: "), i3);
    }

    public static final float s(float f2, float f3) {
        if (f3 == RecyclerView.A1) {
            return RecyclerView.A1;
        }
        if (f3 <= RecyclerView.A1 ? f2 < f3 : f2 > f3) {
            return f3;
        }
        return f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, k54] */
    public static final l44 t(Context context) {
        context.getClass();
        l44 l44Var = new l44(context);
        s34 s34Var = l44Var.b;
        l54 l54Var = s34Var.s;
        l54Var.a(new k44(l54Var));
        l54 l54Var2 = s34Var.s;
        l54Var2.a(new yt0());
        l54Var2.a(new Object());
        return l44Var;
    }

    public static final boolean u(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i2++;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return b53.x(zg6.Z0(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final void v(hk1 hk1Var, pn2 pn2Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Canvas canvas;
        boolean z5;
        float f2;
        oh0 s = hk1Var.I().s();
        pn2 pn2Var2 = (pn2) hk1Var.I().L;
        rn2 rn2Var = pn2Var.a;
        if (!pn2Var.s) {
            pn2Var.a();
            if (!rn2Var.J()) {
                try {
                    pn2Var.a.A(pn2Var.b, pn2Var.c, pn2Var, pn2Var.e);
                } catch (Throwable unused) {
                }
            }
            if (rn2Var.I() > RecyclerView.A1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                s.t();
            }
            Canvas a2 = jd.a(s);
            boolean isHardwareAccelerated = a2.isHardwareAccelerated();
            if (!isHardwareAccelerated) {
                long j = pn2Var.t;
                float f3 = (int) (j >> 32);
                float f4 = (int) (j & 4294967295L);
                long j2 = pn2Var.u;
                float f5 = ((int) (j2 >> 32)) + f3;
                float f6 = ((int) (j2 & 4294967295L)) + f4;
                float a3 = rn2Var.a();
                b30 B = rn2Var.B();
                int M = rn2Var.M();
                if (a3 >= 1.0f && M == 3 && B == null && rn2Var.y() != 1) {
                    a2.save();
                    a2 = a2;
                    f2 = f3;
                } else {
                    oi oiVar = pn2Var.p;
                    if (oiVar == null) {
                        oiVar = dk7.e();
                        pn2Var.p = oiVar;
                    }
                    oiVar.j(a3);
                    oiVar.k(M);
                    oiVar.m(B);
                    a2 = a2;
                    f2 = f3;
                    a2.saveLayer(f2, f4, f5, f6, (Paint) oiVar.L);
                }
                a2.translate(f2, f4);
                a2.concat(rn2Var.F());
            }
            if (!isHardwareAccelerated && pn2Var.w) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                s.m();
                jk2 d2 = pn2Var.d();
                if (d2 instanceof of4) {
                    oh0.l(s, ((of4) d2).d);
                } else if (d2 instanceof pf4) {
                    vi viVar = pn2Var.m;
                    if (viVar != null) {
                        viVar.a.rewind();
                    } else {
                        viVar = zi.a();
                        pn2Var.m = viVar;
                    }
                    vi.c(viVar, ((pf4) d2).d);
                    s.u(viVar);
                } else if (d2 instanceof nf4) {
                    s.u(((nf4) d2).d);
                } else {
                    i.c();
                    return;
                }
            }
            if (pn2Var2 != null) {
                c80 c80Var = pn2Var2.r;
                if (!c80Var.a) {
                    lz2.a("Only add dependencies during a tracking");
                }
                e24 e24Var = (e24) c80Var.d;
                if (e24Var != null) {
                    e24Var.a(pn2Var);
                } else if (((pn2) c80Var.b) != null) {
                    e24 e24Var2 = xu5.a;
                    e24 e24Var3 = new e24();
                    pn2 pn2Var3 = (pn2) c80Var.b;
                    pn2Var3.getClass();
                    e24Var3.a(pn2Var3);
                    e24Var3.a(pn2Var);
                    c80Var.d = e24Var3;
                    c80Var.b = null;
                } else {
                    c80Var.b = pn2Var;
                }
                e24 e24Var4 = (e24) c80Var.e;
                if (e24Var4 != null) {
                    z5 = !e24Var4.l(pn2Var);
                } else if (((pn2) c80Var.c) != pn2Var) {
                    z5 = true;
                } else {
                    c80Var.c = null;
                    z5 = false;
                }
                if (z5) {
                    pn2Var.q++;
                }
            }
            if (!((id) s).a.isHardwareAccelerated()) {
                rh0 rh0Var = pn2Var.o;
                if (rh0Var == null) {
                    rh0Var = new rh0();
                    pn2Var.o = rh0Var;
                }
                os osVar = rh0Var.B;
                od1 od1Var = pn2Var.b;
                sd3 sd3Var = pn2Var.c;
                long U = hk2.U(pn2Var.u);
                od1 v = osVar.v();
                sd3 A = osVar.A();
                oh0 s2 = osVar.s();
                z4 = z2;
                canvas = a2;
                long E = osVar.E();
                z3 = z;
                pn2 pn2Var4 = (pn2) osVar.L;
                osVar.O(od1Var);
                osVar.P(sd3Var);
                osVar.N(s);
                osVar.Q(U);
                osVar.L = pn2Var;
                s.m();
                try {
                    pn2Var.c(rh0Var);
                } finally {
                    s.j();
                    osVar.O(v);
                    osVar.P(A);
                    osVar.N(s2);
                    osVar.Q(E);
                    osVar.L = pn2Var4;
                }
            } else {
                z3 = z;
                z4 = z2;
                canvas = a2;
                rn2Var.w(s);
            }
            if (z4) {
                s.j();
            }
            if (z3) {
                s.p();
            }
            if (!isHardwareAccelerated) {
                canvas.restore();
            }
        }
    }

    public static final String w(Collection collection) {
        collection.getClass();
        if (!collection.isEmpty()) {
            return ah6.X(tq0.S0(collection, ",\n", "\n", "\n", null, 56)).concat("},");
        }
        return " }";
    }

    public static c87 x(String str) {
        int i;
        int i2;
        str.getClass();
        String obj = zg6.Z0(str).toString();
        int i3 = 1;
        if (!gh6.g0(obj, "nightly", true) && !gh6.g0(obj, "nightly-release", true)) {
            ku3 c2 = c87.c0.c(obj);
            int i4 = 0;
            if (c2 != null) {
                x77 T = T((String) ((iu3) c2.a()).get(4));
                int parseInt = Integer.parseInt((String) ((iu3) c2.a()).get(1));
                int parseInt2 = Integer.parseInt((String) ((iu3) c2.a()).get(2));
                int parseInt3 = Integer.parseInt((String) ((iu3) c2.a()).get(3));
                Integer o0 = gh6.o0((String) ((iu3) c2.a()).get(5));
                if (o0 != null) {
                    i = o0.intValue();
                } else {
                    i = 0;
                }
                String str2 = (String) ((iu3) c2.a()).get(6);
                if (str2.length() != 0 || !gh6.f0(obj, ".fix", true)) {
                    if (str2.length() == 0) {
                        i2 = 0;
                        return new c87(T, parseInt, parseInt2, parseInt3, i, i2);
                    }
                    i3 = Integer.parseInt(str2);
                }
                i2 = i3;
                return new c87(T, parseInt, parseInt2, parseInt3, i, i2);
            }
            ku3 c3 = c87.d0.c(obj);
            if (c3 != null) {
                x77 T2 = T((String) ((iu3) c3.a()).get(1));
                int parseInt4 = Integer.parseInt((String) ((iu3) c3.a()).get(2));
                int parseInt5 = Integer.parseInt((String) ((iu3) c3.a()).get(3));
                int parseInt6 = Integer.parseInt((String) ((iu3) c3.a()).get(4));
                Integer o02 = gh6.o0((String) ((iu3) c3.a()).get(5));
                if (o02 != null) {
                    i4 = o02.intValue();
                }
                return new c87(T2, parseInt4, parseInt5, parseInt6, i4, 32, 0);
            }
            i.i("Invalid version string: ".concat(str));
            return null;
        }
        return c87.Z;
    }

    public static hr0 y(tu0 tu0Var) {
        return (hr0) ((sk2) tu0Var).j(ir0.a);
    }

    public static final int z(zh4 zh4Var) {
        long g;
        if (zh4Var.e == jf4.Vertical) {
            g = zh4Var.g() & 4294967295L;
        } else {
            g = zh4Var.g() >> 32;
        }
        return (int) g;
    }

    public float C(View view) {
        float transitionAlpha;
        if (d) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
        return view.getAlpha();
    }

    public void O(View view, float f2) {
        if (d) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
        view.setAlpha(f2);
    }
}
