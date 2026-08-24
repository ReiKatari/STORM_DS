package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.BitmapRegionDecoder;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.widget.Toast;
import com.github.junrar.unpack.decode.Compress;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.mlkit.vision.common.InputImage;
import com.stormds.emulator.R;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import me.magnum.melonds.MelonRomDecryptor;
import me.magnum.melonds.ui.backgrounds.BackgroundsActivity;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.romlist.a;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t00  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class t00 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ t00(ci0 ci0Var, gj0 gj0Var, Context context) {
        this.A = 15;
        this.L = ci0Var;
        this.R = gj0Var;
        this.B = context;
    }

    private final Object a(Object obj) {
        boolean z;
        jt3 jt3Var;
        ci ciVar = (ci) this.B;
        ga6 ga6Var = (ga6) this.L;
        zg5 zg5Var = (zg5) this.R;
        vy4 vy4Var = (vy4) obj;
        long j = vy4Var.c;
        p27 p27Var = (p27) ciVar.R;
        if (p27Var.k() && p27Var.n().a.B.length() != 0 && (jt3Var = p27Var.d) != null && jt3Var.d() != null) {
            ciVar.q(p27Var.n(), j, false, ga6Var);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            vy4Var.a();
            zg5Var.A = true;
        }
        return jg7.a;
    }

    private final Object b(Object obj) {
        wq6 wq6Var = (wq6) this.B;
        li7 li7Var = (li7) this.R;
        Throwable th = (Throwable) obj;
        if ((th instanceof f23) && ((f23) th).A == 3) {
            hv.L(wq6Var.b.f, null, null, new hn(wq6Var, li7Var, (uq6) null, (r41) null), 3);
            return jg7.a;
        }
        throw null;
    }

    private final Object f(Object obj) {
        ep epVar;
        zg5 zg5Var = (zg5) this.B;
        ep epVar2 = (ep) this.L;
        nn6 nn6Var = (nn6) this.R;
        ep epVar3 = (ep) obj;
        if (zg5Var.A) {
            Object obj2 = epVar3.a;
            int i = epVar3.c;
            int i2 = epVar3.b;
            if ((obj2 instanceof nn6) && i2 == epVar2.b && i == epVar2.c) {
                if (nn6Var == null) {
                    nn6Var = new nn6(0L, 0L, (oj2) null, (ij2) null, (jj2) null, (li2) null, (String) null, 0L, (x20) null, (f37) null, (gy3) null, 0L, (b17) null, (ge6) null, 65535);
                }
                epVar = new ep(nn6Var, i2, i);
                zg5Var.A = epVar2.equals(epVar3);
                return epVar;
            }
        }
        epVar = epVar3;
        zg5Var.A = epVar2.equals(epVar3);
        return epVar;
    }

    private final Object h(Object obj) {
        qn2 qn2Var = (qn2) this.L;
        t37 t37Var = (t37) ((dh5) this.R).A;
        c37 n = ((yc1) this.B).n((List) obj);
        if (t37Var != null) {
            t37Var.a(null, n);
        }
        qn2Var.g(n);
        return jg7.a;
    }

    /* JADX WARN: Type inference failed for: r0v116, types: [dh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v48, types: [dh5, java.lang.Object] */
    @Override // defpackage.qn2
    public final Object g(Object obj) {
        Object em5Var;
        InputStream openInputStream;
        BitmapRegionDecoder newInstance;
        float f;
        long j;
        boolean z;
        f80 c;
        d37 d37Var;
        xj0 xj0Var;
        long j2;
        float f2;
        char c2;
        List actions;
        boolean z2;
        zv0 zv0Var;
        boolean shouldShowIcon;
        Drawable icon;
        zv0 zv0Var2;
        zv0 zv0Var3;
        int intValue;
        int intValue2;
        int intValue3;
        Integer d;
        Integer e;
        Integer e2;
        Integer d2;
        a47 a47Var;
        a47 a47Var2;
        b47 b47Var;
        b47 b47Var2;
        Integer d3;
        Integer e3;
        Integer e4;
        Integer d4;
        a47 a47Var3;
        a47 a47Var4;
        b47 b47Var3;
        b47 b47Var4;
        rr6 rr6Var;
        int i = this.A;
        int i2 = 28;
        int i3 = 0;
        c37 c37Var = null;
        Object obj2 = jg7.a;
        Object obj3 = this.R;
        Object obj4 = this.L;
        Object obj5 = this.B;
        switch (i) {
            case 0:
                Object obj6 = null;
                Context context = (Context) obj5;
                j37 j37Var = (j37) obj4;
                v10 v10Var = (v10) obj3;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    try {
                        openInputStream = context.getContentResolver().openInputStream(uri);
                    } catch (Throwable th) {
                        em5Var = new em5(th);
                    }
                    if (openInputStream != null) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            newInstance = ma.c(openInputStream);
                        } else {
                            newInstance = BitmapRegionDecoder.newInstance(openInputStream, true);
                        }
                        if (newInstance != null) {
                            newInstance.recycle();
                            obj6 = obj2;
                        }
                        openInputStream.close();
                        if (obj6 != null) {
                            em5Var = obj2;
                            if (em5Var instanceof em5) {
                                Toast.makeText(context, (int) R.string.background_add_processing_failed, 1).show();
                            } else {
                                String V = hf.V(zl1.g(context, uri));
                                if (V == null) {
                                    V = "";
                                }
                                j37.c(j37Var, V, new y(4, uri, v10Var));
                            }
                        }
                    }
                    throw new Exception("Failed to open stream");
                }
                return obj2;
            case 1:
                final BackgroundsActivity backgroundsActivity = (BackgroundsActivity) obj5;
                final sg6 sg6Var = (sg6) obj4;
                final rc4 rc4Var = (rc4) obj3;
                nc4 nc4Var = (nc4) obj;
                int i4 = BackgroundsActivity.B0;
                nc4Var.getClass();
                jx2.o(nc4Var, gh5.a(q10.class), zt1.A, new zv0(1638678397, true, new go2() { // from class: m10
                    @Override // defpackage.go2
                    public final Object l(Object obj7, Object obj8, Object obj9, Object obj10) {
                        sn snVar = (sn) obj7;
                        int intValue4 = ((Integer) obj10).intValue();
                        int i5 = BackgroundsActivity.B0;
                        snVar.getClass();
                        ((sb4) obj8).getClass();
                        BackgroundsActivity backgroundsActivity2 = BackgroundsActivity.this;
                        v10 v10Var2 = (v10) backgroundsActivity2.A0.getValue();
                        xq2 xq2Var = (xq2) ((px0) obj9);
                        boolean h = xq2Var.h(backgroundsActivity2);
                        Object P = xq2Var.P();
                        vs0 vs0Var = ox0.a;
                        if (h || P == vs0Var) {
                            P = new a0(1, backgroundsActivity2, BackgroundsActivity.class, "onBackgroundSelected", "onBackgroundSelected(Lme/magnum/melonds/domain/model/Background;)V", 0, 0, 2);
                            xq2Var.l0(P);
                        }
                        qn2 qn2Var = (qn2) ((po2) P);
                        rc4 rc4Var2 = rc4Var;
                        boolean h2 = xq2Var.h(rc4Var2);
                        Object P2 = xq2Var.P();
                        if (h2 || P2 == vs0Var) {
                            P2 = new k0(rc4Var2, 13);
                            xq2Var.l0(P2);
                        }
                        qn2 qn2Var2 = (qn2) P2;
                        boolean h3 = xq2Var.h(backgroundsActivity2);
                        Object P3 = xq2Var.P();
                        if (h3 || P3 == vs0Var) {
                            P3 = new a5(backgroundsActivity2, 6);
                            xq2Var.l0(P3);
                        }
                        nw7.i(v10Var2, sg6Var, snVar, qn2Var, qn2Var2, (on2) P3, xq2Var, (intValue4 << 6) & 896);
                        return jg7.a;
                    }
                }));
                t10.Companion.getClass();
                jx2.o(nc4Var, gh5.a(t10.class), t10.m, new zv0(-44096588, true, new w5(1, sg6Var, rc4Var)));
                return obj2;
            case 2:
                qn2 qn2Var = (qn2) obj5;
                qa4 qa4Var = (qa4) obj3;
                c37 c37Var2 = (c37) obj;
                ((qa4) obj4).setValue(c37Var2);
                boolean k = nb3.k((String) qa4Var.getValue(), c37Var2.a.B);
                fp fpVar = c37Var2.a;
                qa4Var.setValue(fpVar.B);
                if (!k) {
                    qn2Var.g(fpVar.B);
                }
                return obj2;
            case 3:
                qn2 qn2Var2 = (qn2) obj5;
                eo2 eo2Var = (eo2) obj4;
                qa4 qa4Var2 = (qa4) obj3;
                jo0 jo0Var = (jo0) obj;
                jo0Var.getClass();
                jn0 jn0Var = (jn0) qa4Var2.getValue();
                if (nb3.k(jn0Var, in0.b)) {
                    qn2Var2.g(jo0Var);
                } else if (jn0Var instanceof gn0) {
                    eo2Var.o(((gn0) jn0Var).b, jo0Var);
                }
                qa4Var2.setValue(hn0.b);
                return obj2;
            case 4:
                p31 p31Var = (p31) obj5;
                rc3 rc3Var = (rc3) obj4;
                k86 k86Var = (k86) obj3;
                float floatValue = ((Float) obj).floatValue();
                if (p31Var.m0) {
                    f = 1.0f;
                } else {
                    f = -1.0f;
                }
                m86 m86Var = p31Var.l0;
                long e5 = m86Var.e(m86Var.h(f * floatValue));
                m86 m86Var2 = k86Var.a;
                float g = m86Var.g(m86Var.e(m86Var2.c(m86Var2.k, e5, 1))) * f;
                if (Math.abs(g) < Math.abs(floatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + g + " < " + floatValue + ')');
                    cancellationException.initCause(null);
                    rc3Var.h(cancellationException);
                }
                return obj2;
            case 5:
                jt3 jt3Var = (jt3) obj5;
                c37 c37Var3 = (c37) obj4;
                mk4 mk4Var = (mk4) obj3;
                no1 no1Var = (no1) obj;
                b47 d5 = jt3Var.d();
                if (d5 != null) {
                    xj0 G = no1Var.i0().G();
                    long j3 = ((k47) jt3Var.A.getValue()).a;
                    long j4 = ((k47) jt3Var.B.getValue()).a;
                    a47 a47Var5 = d5.a;
                    v84 v84Var = a47Var5.b;
                    z37 z37Var = a47Var5.a;
                    aj ajVar = jt3Var.y;
                    long j5 = jt3Var.z;
                    if (!k47.c(j3)) {
                        ajVar.l(j5);
                        int s = mk4Var.s(k47.f(j3));
                        int s2 = mk4Var.s(k47.e(j3));
                        if (s != s2) {
                            G.f(a47Var5.i(s, s2), ajVar);
                        }
                    } else if (!k47.c(j4)) {
                        long b = z37Var.b.b();
                        kt0 kt0Var = new kt0(b);
                        if (b == 16) {
                            kt0Var = null;
                        }
                        if (kt0Var != null) {
                            j = kt0Var.a;
                        } else {
                            j = kt0.b;
                        }
                        ajVar.l(kt0.c(kt0.e(j) * 0.2f, j));
                        int s3 = mk4Var.s(k47.f(j4));
                        int s4 = mk4Var.s(k47.e(j4));
                        if (s3 != s4) {
                            G.f(a47Var5.i(s3, s4), ajVar);
                        }
                    } else if (!k47.c(c37Var3.b)) {
                        ajVar.l(j5);
                        long j6 = c37Var3.b;
                        int s5 = mk4Var.s(k47.f(j6));
                        int s6 = mk4Var.s(k47.e(j6));
                        if (s5 != s6) {
                            G.f(a47Var5.i(s5, s6), ajVar);
                        }
                    }
                    if (a47Var5.d() && z37Var.f != 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        long j7 = a47Var5.c;
                        of5 b2 = kj2.b(0L, (Float.floatToRawIntBits((int) (j7 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j7 & 4294967295L)) & 4294967295L));
                        G.h();
                        xj0.q(G, b2);
                    }
                    nn6 nn6Var = z37Var.b.a;
                    b17 b17Var = nn6Var.m;
                    e37 e37Var = nn6Var.a;
                    if (b17Var == null) {
                        b17Var = b17.b;
                    }
                    b17 b17Var2 = b17Var;
                    ge6 ge6Var = nn6Var.n;
                    if (ge6Var == null) {
                        ge6Var = ge6.d;
                    }
                    ge6 ge6Var2 = ge6Var;
                    oo1 oo1Var = nn6Var.p;
                    if (oo1Var == null) {
                        oo1Var = kc2.a;
                    }
                    oo1 oo1Var2 = oo1Var;
                    try {
                        c = e37Var.c();
                        d37Var = d37.a;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        if (c != null) {
                            if (e37Var != d37Var) {
                                f2 = e37Var.a();
                            } else {
                                f2 = 1.0f;
                            }
                            xj0Var = G;
                            v84Var.j(xj0Var, c, f2, ge6Var2, b17Var2, oo1Var2);
                        } else {
                            xj0Var = G;
                            if (e37Var != d37Var) {
                                j2 = e37Var.b();
                            } else {
                                j2 = kt0.b;
                            }
                            v84Var.i(xj0Var, j2, ge6Var2, b17Var2, oo1Var2);
                        }
                        if (!z) {
                            return obj2;
                        }
                        xj0Var.p();
                        return obj2;
                    } catch (Throwable th3) {
                        th = th3;
                        if (z) {
                            G.p();
                        }
                        throw th;
                    }
                }
                return obj2;
            case 6:
                jg1 jg1Var = (jg1) obj5;
                tu0 tu0Var = (tu0) obj4;
                h37 h37Var = (h37) obj3;
                Throwable th4 = (Throwable) obj;
                if (th4 != null) {
                    if (th4 instanceof CancellationException) {
                        tu0Var.z((CancellationException) th4);
                    } else {
                        tu0Var.v0(th4);
                    }
                } else {
                    h37Var.g(jg1Var.k());
                    tu0Var.b0(obj2);
                }
                return obj2;
            case 7:
                ah5 ah5Var = (ah5) obj5;
                so soVar = (so) obj;
                float floatValue2 = ((Number) soVar.e.getValue()).floatValue() - ah5Var.A;
                float a = ((i86) obj4).a(floatValue2);
                ah5Var.A = ((Number) soVar.e.getValue()).floatValue();
                ((ah5) obj3).A = ((Number) soVar.a.b.g(soVar.f)).floatValue();
                if (Math.abs(floatValue2 - a) > 0.5f) {
                    soVar.a();
                }
                return obj2;
            case 8:
                Context context2 = (Context) obj5;
                x07 x07Var = (x07) obj3;
                k41 k41Var = (k41) obj;
                List list = ((l07) obj4).a;
                int size = list.size();
                int i5 = 0;
                while (i5 < size) {
                    k07 k07Var = (k07) list.get(i5);
                    if (k07Var instanceof s07) {
                        s07 s07Var = (s07) k07Var;
                        z5 z5Var = new z5(s07Var, 7);
                        if (s07Var.c == 0) {
                            zv0Var3 = null;
                        } else {
                            zv0Var3 = new zv0(-1930700965, true, new uf1(s07Var, i3));
                        }
                        k41.b(k41Var, z5Var, zv0Var3, new q6(24, s07Var, x07Var), 6);
                    } else {
                        if (k07Var instanceof y07) {
                            if (Build.VERSION.SDK_INT >= i2) {
                                y07 y07Var = (y07) k07Var;
                                if (context2 != null) {
                                    int i6 = y07Var.c;
                                    TextClassification textClassification = y07Var.b;
                                    if (i6 >= 0) {
                                        actions = textClassification.getActions();
                                        RemoteAction d6 = q66.d(actions.get(i6));
                                        if (i6 == 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        y36 y36Var = new y36(d6, 10);
                                        if (!z2) {
                                            shouldShowIcon = d6.shouldShowIcon();
                                            if (!shouldShowIcon) {
                                                c2 = 2;
                                                zv0Var = null;
                                                k41.b(k41Var, y36Var, zv0Var, new t46(d6, 13), 6);
                                            }
                                        }
                                        c2 = 2;
                                        zv0Var = new zv0(-1261173016, true, new uf1(d6, 2));
                                        k41.b(k41Var, y36Var, zv0Var, new t46(d6, 13), 6);
                                    } else {
                                        y36 y36Var2 = new y36(textClassification, 9);
                                        icon = textClassification.getIcon();
                                        if (icon != null) {
                                            zv0Var2 = new zv0(-1123224187, true, new uf1(icon, 1));
                                        } else {
                                            zv0Var2 = null;
                                        }
                                        k41.b(k41Var, y36Var2, zv0Var2, new yu6(1, context2, textClassification), 6);
                                    }
                                }
                            }
                        } else {
                            c2 = 2;
                            if (k07Var instanceof w07) {
                                k41Var.a.add(l.d);
                            }
                        }
                        i5++;
                        i2 = 28;
                        i3 = 0;
                    }
                    c2 = 2;
                    i5++;
                    i2 = 28;
                    i3 = 0;
                }
                return obj2;
            case 9:
                mm6 mm6Var = (mm6) obj5;
                sb4 sb4Var = (sb4) obj4;
                gl1 gl1Var = (gl1) obj;
                mm6Var.add(sb4Var);
                return new kn((ij1) obj3, sb4Var, mm6Var);
            case 10:
                xu1 xu1Var = (xu1) obj4;
                uu1 uu1Var = (uu1) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i7 = EmulatorActivity.Z1;
                int i8 = 1 << ((lj5) obj5).a;
                if (booleanValue) {
                    intValue = ((Number) xu1Var.c()).intValue() & (~i8);
                } else {
                    intValue = ((Number) xu1Var.c()).intValue() | i8;
                }
                uu1Var.g(Integer.valueOf(intValue));
                return obj2;
            case 11:
                on2 on2Var = (on2) obj4;
                qn2 qn2Var3 = (qn2) obj3;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                int i9 = EmulatorActivity.Z1;
                int i10 = 1 << ((qj5) obj5).a;
                if (booleanValue2) {
                    intValue2 = ((Number) on2Var.c()).intValue() & (~i10);
                } else {
                    intValue2 = ((Number) on2Var.c()).intValue() | i10;
                }
                qn2Var3.g(Integer.valueOf(intValue2));
                return obj2;
            case 12:
                xu1 xu1Var2 = (xu1) obj4;
                uu1 uu1Var2 = (uu1) obj3;
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                int i11 = EmulatorActivity.Z1;
                int i12 = 1 << ((pj5) obj5).a;
                if (booleanValue3) {
                    intValue3 = ((Number) xu1Var2.c()).intValue() & (~i12);
                } else {
                    intValue3 = ((Number) xu1Var2.c()).intValue() | i12;
                }
                uu1Var2.g(Integer.valueOf(intValue3));
                return obj2;
            case 13:
                sz1 sz1Var = (sz1) obj5;
                String str = (String) obj4;
                ep2 ep2Var = (ep2) obj3;
                Throwable th5 = (Throwable) obj;
                if (th5 != null) {
                    ?? obj7 = new Object();
                    boolean h1 = sz1Var.h1(str, "runtime_job_failed", new q6(28, sz1Var, obj7));
                    sx1 sx1Var = sz1Var.w;
                    if (h1) {
                        sz1Var.r0();
                        sx1Var.d = false;
                        nv4 nv4Var = (nv4) obj7.A;
                        if (nv4Var != null) {
                            hv.L(to7.a(sz1Var), null, null, new a12(nv4Var, sz1Var, (r41) null), 3);
                        }
                        sz1Var.G0("ra_runtime_job_terminated", new vr4("error", th5.getClass().getSimpleName()));
                        if (!(th5 instanceof CancellationException)) {
                            sx1Var.d(dp2.DISABLED_LOAD_ERROR);
                            sz1Var.N0.k(new la5(ep2Var.f));
                        }
                    }
                }
                return obj2;
            case 14:
                m20 m20Var = (m20) obj4;
                Context context3 = (Context) obj5;
                qa4 qa4Var3 = (qa4) obj3;
                Uri uri2 = (Uri) obj;
                if (uri2 != null && ((fk3) qa4Var3.getValue()) != null) {
                    fk3 fk3Var = (fk3) qa4Var3.getValue();
                    fk3Var.getClass();
                    zn3 zn3Var = new zn3(context3, 1);
                    m20Var.getClass();
                    context3.getClass();
                    as0 a2 = to7.a(m20Var);
                    xe1 xe1Var = xk1.a;
                    hv.L(a2, de1.L, null, new k20(fk3Var, context3, uri2, zn3Var, null), 2);
                }
                qa4Var3.setValue(null);
                return obj2;
            case 15:
                Void r0 = (Void) obj;
                ((ci0) obj4).j((gj0) obj3, q41.a((Context) obj5));
                return r0;
            case 16:
                hu3 hu3Var = (hu3) obj5;
                final ou3 ou3Var = (ou3) obj4;
                final qn2 qn2Var4 = (qn2) obj3;
                gl1 gl1Var2 = (gl1) obj;
                final ?? obj8 = new Object();
                fu3 fu3Var = new fu3() { // from class: du3
                    @Override // defpackage.fu3
                    public final void h(hu3 hu3Var2, st3 st3Var) {
                        int i13 = eu3.a[st3Var.ordinal()];
                        dh5 dh5Var = obj8;
                        if (i13 != 1) {
                            if (i13 != 2) {
                                return;
                            }
                            i00 i00Var = (i00) dh5Var.A;
                            if (i00Var != null) {
                                i00Var.a();
                            }
                            dh5Var.A = null;
                            return;
                        }
                        dh5Var.A = qn2Var4.g(ou3.this);
                    }
                };
                hu3Var.getLifecycle().a(fu3Var);
                return new kn(hu3Var, fu3Var, obj8, 2);
            case 17:
                pp6 pp6Var = (pp6) obj4;
                op5 op5Var = (op5) obj;
                op5Var.k(((Number) pp6Var.getValue()).floatValue());
                op5Var.l(((Number) pp6Var.getValue()).floatValue());
                op5Var.c(((Number) ((pp6) obj3).getValue()).floatValue());
                op5Var.r(((i97) ((qa4) obj5).getValue()).a);
                return obj2;
            case 18:
                er3 er3Var = (er3) obj;
                er3Var.getClass();
                List c0 = hf.c0(new vr4(gn6.ALPHABETICALLY, "A-Z"), new vr4(gn6.RECENTLY_PLAYED, null), new vr4(gn6.MOST_PLAYED, null));
                er3Var.h0(c0.size(), null, new j5(20, c0), new zv0(802480018, true, new t5(5, (qn2) obj3, (gn6) obj5, (hn6) obj4, c0)));
                return obj2;
            case 19:
                List list2 = (List) obj5;
                er3 er3Var2 = (er3) obj;
                er3Var2.getClass();
                er3Var2.h0(list2.size(), null, new j5(19, list2), new zv0(802480018, true, new ir5(list2, (qw5) obj4, (qn2) obj3)));
                return obj2;
            case 20:
                Map map = (Map) obj5;
                String str2 = (String) obj4;
                nh2 nh2Var = (nh2) obj3;
                ((gl1) obj).getClass();
                map.put(str2, nh2Var);
                return new kn(map, str2, nh2Var, 3);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                vv5 vv5Var = (vv5) obj;
                vv5Var.getClass();
                hv.L((w61) obj5, null, null, new u12((ue1) obj4, vv5Var, (List) obj3, (r41) null, 28), 3);
                return obj2;
            case 22:
                a aVar = (a) obj5;
                qa4 qa4Var4 = (qa4) obj4;
                qa4 qa4Var5 = (qa4) obj3;
                pq5 pq5Var = (pq5) obj;
                pq5Var.getClass();
                if (pq5Var.h) {
                    Context requireContext = aVar.requireContext();
                    requireContext.getClass();
                    if (MelonRomDecryptor.a.a(requireContext, pq5Var.d) == MelonRomDecryptor.b.MODCRYPT_ENCRYPTED) {
                        qa4Var4.setValue(pq5Var);
                        qa4Var5.setValue(xc1.CONFIRM);
                    } else {
                        qn2 qn2Var5 = aVar.e0;
                        if (qn2Var5 == null) {
                            return null;
                        }
                        qn2Var5.g(pq5Var);
                    }
                } else {
                    qn2 qn2Var6 = aVar.e0;
                    if (qn2Var6 == null) {
                        return null;
                    }
                    qn2Var6.g(pq5Var);
                }
                return obj2;
            case ConnectionResult.API_DISABLED /* 23 */:
                p46 p46Var = (p46) obj5;
                u46 u46Var = (u46) obj3;
                gl1 gl1Var3 = (gl1) obj;
                ja4 ja4Var = p46Var.B;
                if (!ja4Var.b(obj4)) {
                    p46Var.A.remove(obj4);
                    ja4Var.m(obj4, u46Var);
                    return new kn(p46Var, obj4, u46Var, 4);
                }
                u34.A(obj4, " was used multiple times ", "Key ");
                return null;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return a(obj);
            case 25:
                jk4 jk4Var = (jk4) obj;
                hv.L((w61) obj5, null, null, new bf4((go1) obj4, (qa4) obj3, null, 17), 3);
                return obj2;
            case SubAllocator.N4 /* 26 */:
                return b(obj);
            case 27:
                return f(obj);
            case 28:
                return h(obj);
            default:
                v17 v17Var = (v17) obj4;
                zg5 zg5Var = (zg5) obj3;
                b27 b27Var = (b27) obj;
                switch (u17.a[((og3) obj5).ordinal()]) {
                    case 1:
                        v17Var.b.d(false);
                        break;
                    case 2:
                        v17Var.b.p();
                        break;
                    case 3:
                        v17Var.b.f();
                        break;
                    case 4:
                        b27Var.e.a = null;
                        if (b27Var.g.B.length() > 0) {
                            if (k47.c(b27Var.f)) {
                                b27Var.i();
                                break;
                            } else {
                                boolean f3 = b27Var.f();
                                long j8 = b27Var.f;
                                if (f3) {
                                    int f4 = k47.f(j8);
                                    b27Var.q(f4, f4);
                                    break;
                                } else {
                                    int e6 = k47.e(j8);
                                    b27Var.q(e6, e6);
                                    break;
                                }
                            }
                        }
                        break;
                    case 5:
                        b27Var.e.a = null;
                        if (b27Var.g.B.length() > 0) {
                            if (k47.c(b27Var.f)) {
                                b27Var.m();
                                break;
                            } else {
                                boolean f5 = b27Var.f();
                                long j9 = b27Var.f;
                                if (f5) {
                                    int e7 = k47.e(j9);
                                    b27Var.q(e7, e7);
                                    break;
                                } else {
                                    int f6 = k47.f(j9);
                                    b27Var.q(f6, f6);
                                    break;
                                }
                            }
                        }
                        break;
                    case 6:
                        j47 j47Var = b27Var.e;
                        j47Var.a = null;
                        fp fpVar2 = b27Var.g;
                        String str3 = fpVar2.B;
                        String str4 = fpVar2.B;
                        if (str3.length() > 0) {
                            if (b27Var.f()) {
                                j47Var.a = null;
                                if (str4.length() > 0 && (e = b27Var.e()) != null) {
                                    int intValue4 = e.intValue();
                                    b27Var.q(intValue4, intValue4);
                                    break;
                                }
                            } else {
                                j47Var.a = null;
                                if (str4.length() > 0 && (d = b27Var.d()) != null) {
                                    int intValue5 = d.intValue();
                                    b27Var.q(intValue5, intValue5);
                                    break;
                                }
                            }
                        }
                        break;
                    case 7:
                        j47 j47Var2 = b27Var.e;
                        j47Var2.a = null;
                        fp fpVar3 = b27Var.g;
                        String str5 = fpVar3.B;
                        String str6 = fpVar3.B;
                        if (str5.length() > 0) {
                            if (b27Var.f()) {
                                j47Var2.a = null;
                                if (str6.length() > 0 && (d2 = b27Var.d()) != null) {
                                    int intValue6 = d2.intValue();
                                    b27Var.q(intValue6, intValue6);
                                    break;
                                }
                            } else {
                                j47Var2.a = null;
                                if (str6.length() > 0 && (e2 = b27Var.e()) != null) {
                                    int intValue7 = e2.intValue();
                                    b27Var.q(intValue7, intValue7);
                                    break;
                                }
                            }
                        }
                        break;
                    case 8:
                        b27Var.l();
                        break;
                    case 9:
                        b27Var.j();
                        break;
                    case 10:
                        if (b27Var.g.B.length() > 0 && (a47Var = b27Var.c) != null) {
                            int g2 = b27Var.g(a47Var, -1);
                            b27Var.q(g2, g2);
                            break;
                        }
                        break;
                    case 11:
                        if (b27Var.g.B.length() > 0 && (a47Var2 = b27Var.c) != null) {
                            int g3 = b27Var.g(a47Var2, 1);
                            b27Var.q(g3, g3);
                            break;
                        }
                        break;
                    case 12:
                        if (b27Var.g.B.length() > 0 && (b47Var = b27Var.i) != null) {
                            int h = b27Var.h(b47Var, -1);
                            b27Var.q(h, h);
                            break;
                        }
                        break;
                    case 13:
                        if (b27Var.g.B.length() > 0 && (b47Var2 = b27Var.i) != null) {
                            int h2 = b27Var.h(b47Var2, 1);
                            b27Var.q(h2, h2);
                            break;
                        }
                        break;
                    case 14:
                        b27Var.o();
                        break;
                    case 15:
                        b27Var.n();
                        break;
                    case 16:
                        b27Var.e.a = null;
                        if (b27Var.g.B.length() > 0) {
                            if (b27Var.f()) {
                                b27Var.o();
                                break;
                            } else {
                                b27Var.n();
                                break;
                            }
                        }
                        break;
                    case 17:
                        b27Var.e.a = null;
                        if (b27Var.g.B.length() > 0) {
                            if (b27Var.f()) {
                                b27Var.n();
                                break;
                            } else {
                                b27Var.o();
                                break;
                            }
                        }
                        break;
                    case 18:
                        b27Var.e.a = null;
                        if (b27Var.g.B.length() > 0) {
                            b27Var.q(0, 0);
                            break;
                        }
                        break;
                    case 19:
                        b27Var.e.a = null;
                        fp fpVar4 = b27Var.g;
                        if (fpVar4.B.length() > 0) {
                            int length = fpVar4.B.length();
                            b27Var.q(length, length);
                            break;
                        }
                        break;
                    case 20:
                        List a3 = b27Var.a(new r76(22));
                        if (a3 != null) {
                            v17Var.a(a3);
                            break;
                        }
                        break;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        List a4 = b27Var.a(new r76(23));
                        if (a4 != null) {
                            v17Var.a(a4);
                            break;
                        }
                        break;
                    case 22:
                        List a5 = b27Var.a(new r76(24));
                        if (a5 != null) {
                            v17Var.a(a5);
                            break;
                        }
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        List a6 = b27Var.a(new r76(25));
                        if (a6 != null) {
                            v17Var.a(a6);
                            break;
                        }
                        break;
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        List a7 = b27Var.a(new r76(26));
                        if (a7 != null) {
                            v17Var.a(a7);
                            break;
                        }
                        break;
                    case 25:
                        List a8 = b27Var.a(new r76(27));
                        if (a8 != null) {
                            v17Var.a(a8);
                            break;
                        }
                        break;
                    case SubAllocator.N4 /* 26 */:
                        if (!v17Var.e) {
                            v17Var.a(hf.b0(new pu0("\n", 1)));
                            break;
                        } else {
                            zg5Var.A = v17Var.a.x.B.r.b(v17Var.l);
                            break;
                        }
                    case 27:
                        if (!v17Var.e) {
                            v17Var.a(hf.b0(new pu0("\t", 1)));
                            break;
                        } else {
                            zg5Var.A = false;
                            break;
                        }
                    case 28:
                        b27Var.e.a = null;
                        fp fpVar5 = b27Var.g;
                        if (fpVar5.B.length() > 0) {
                            b27Var.q(0, fpVar5.B.length());
                            break;
                        }
                        break;
                    case 29:
                        b27Var.i();
                        b27Var.p();
                        break;
                    case 30:
                        b27Var.m();
                        b27Var.p();
                        break;
                    case 31:
                        j47 j47Var3 = b27Var.e;
                        j47Var3.a = null;
                        fp fpVar6 = b27Var.g;
                        String str7 = fpVar6.B;
                        String str8 = fpVar6.B;
                        if (str7.length() > 0) {
                            if (b27Var.f()) {
                                j47Var3.a = null;
                                if (str8.length() > 0 && (e3 = b27Var.e()) != null) {
                                    int intValue8 = e3.intValue();
                                    b27Var.q(intValue8, intValue8);
                                }
                            } else {
                                j47Var3.a = null;
                                if (str8.length() > 0 && (d3 = b27Var.d()) != null) {
                                    int intValue9 = d3.intValue();
                                    b27Var.q(intValue9, intValue9);
                                }
                            }
                        }
                        b27Var.p();
                        break;
                    case 32:
                        j47 j47Var4 = b27Var.e;
                        j47Var4.a = null;
                        fp fpVar7 = b27Var.g;
                        String str9 = fpVar7.B;
                        String str10 = fpVar7.B;
                        if (str9.length() > 0) {
                            if (b27Var.f()) {
                                j47Var4.a = null;
                                if (str10.length() > 0 && (d4 = b27Var.d()) != null) {
                                    int intValue10 = d4.intValue();
                                    b27Var.q(intValue10, intValue10);
                                }
                            } else {
                                j47Var4.a = null;
                                if (str10.length() > 0 && (e4 = b27Var.e()) != null) {
                                    int intValue11 = e4.intValue();
                                    b27Var.q(intValue11, intValue11);
                                }
                            }
                        }
                        b27Var.p();
                        break;
                    case 33:
                        b27Var.l();
                        b27Var.p();
                        break;
                    case 34:
                        b27Var.j();
                        b27Var.p();
                        break;
                    case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                        b27Var.o();
                        b27Var.p();
                        break;
                    case 36:
                        b27Var.n();
                        b27Var.p();
                        break;
                    case 37:
                        b27Var.e.a = null;
                        if (b27Var.g.B.length() > 0) {
                            if (b27Var.f()) {
                                b27Var.o();
                            } else {
                                b27Var.n();
                            }
                        }
                        b27Var.p();
                        break;
                    case SubAllocator.N_INDEXES /* 38 */:
                        b27Var.e.a = null;
                        if (b27Var.g.B.length() > 0) {
                            if (b27Var.f()) {
                                b27Var.n();
                            } else {
                                b27Var.o();
                            }
                        }
                        b27Var.p();
                        break;
                    case 39:
                        if (b27Var.g.B.length() > 0 && (a47Var3 = b27Var.c) != null) {
                            int g4 = b27Var.g(a47Var3, -1);
                            b27Var.q(g4, g4);
                        }
                        b27Var.p();
                        break;
                    case 40:
                        if (b27Var.g.B.length() > 0 && (a47Var4 = b27Var.c) != null) {
                            int g5 = b27Var.g(a47Var4, 1);
                            b27Var.q(g5, g5);
                        }
                        b27Var.p();
                        break;
                    case 41:
                        if (b27Var.g.B.length() > 0 && (b47Var3 = b27Var.i) != null) {
                            int h3 = b27Var.h(b47Var3, -1);
                            b27Var.q(h3, h3);
                        }
                        b27Var.p();
                        break;
                    case 42:
                        if (b27Var.g.B.length() > 0 && (b47Var4 = b27Var.i) != null) {
                            int h4 = b27Var.h(b47Var4, 1);
                            b27Var.q(h4, h4);
                        }
                        b27Var.p();
                        break;
                    case 43:
                        b27Var.e.a = null;
                        if (b27Var.g.B.length() > 0) {
                            b27Var.q(0, 0);
                        }
                        b27Var.p();
                        break;
                    case 44:
                        b27Var.e.a = null;
                        fp fpVar8 = b27Var.g;
                        if (fpVar8.B.length() > 0) {
                            int length2 = fpVar8.B.length();
                            b27Var.q(length2, length2);
                        }
                        b27Var.p();
                        break;
                    case 45:
                        b27Var.e.a = null;
                        if (b27Var.g.B.length() > 0) {
                            long j10 = b27Var.f;
                            int i13 = k47.c;
                            int i14 = (int) (j10 & 4294967295L);
                            b27Var.q(i14, i14);
                            break;
                        }
                        break;
                    case 46:
                        fg7 fg7Var = v17Var.h;
                        if (fg7Var != null) {
                            fg7Var.a(c37.a(b27Var.h, b27Var.g, b27Var.f, 4));
                        }
                        fg7 fg7Var2 = v17Var.h;
                        if (fg7Var2 != null) {
                            rr6 rr6Var2 = fg7Var2.a;
                            if (rr6Var2 != null && (rr6Var = (rr6) rr6Var2.B) != null) {
                                fg7Var2.a = rr6Var;
                                fg7Var2.c -= ((c37) rr6Var2.L).a.B.length();
                                fg7Var2.b = new rr6(8, fg7Var2.b, (c37) rr6Var2.L);
                                c37Var = (c37) rr6Var.L;
                            }
                            if (c37Var != null) {
                                v17Var.k.g(c37Var);
                                break;
                            }
                        }
                        break;
                    case 47:
                        fg7 fg7Var3 = v17Var.h;
                        if (fg7Var3 != null) {
                            rr6 rr6Var3 = fg7Var3.b;
                            if (rr6Var3 != null) {
                                fg7Var3.b = (rr6) rr6Var3.B;
                                c37 c37Var4 = (c37) rr6Var3.L;
                                fg7Var3.a = new rr6(8, fg7Var3.a, c37Var4);
                                fg7Var3.c = c37Var4.a.B.length() + fg7Var3.c;
                                c37Var = (c37) rr6Var3.L;
                            }
                            if (c37Var != null) {
                                v17Var.k.g(c37Var);
                                break;
                            }
                        }
                        break;
                    case Compress.DC20 /* 48 */:
                    case 49:
                        break;
                    default:
                        i.d();
                        return null;
                }
                return obj2;
        }
    }

    public /* synthetic */ t00(p31 p31Var, nh7 nh7Var, rc3 rc3Var, k86 k86Var) {
        this.A = 4;
        this.B = p31Var;
        this.L = rc3Var;
        this.R = k86Var;
    }

    public /* synthetic */ t00(ah5 ah5Var, i86 i86Var, ah5 ah5Var2, wd1 wd1Var) {
        this.A = 7;
        this.B = ah5Var;
        this.L = i86Var;
        this.R = ah5Var2;
    }

    public /* synthetic */ t00(wq6 wq6Var, jg1 jg1Var, uq6 uq6Var, li7 li7Var) {
        this.A = 26;
        this.B = wq6Var;
        this.L = jg1Var;
        this.R = li7Var;
    }

    public /* synthetic */ t00(Object obj, Context context, Object obj2, int i) {
        this.A = i;
        this.L = obj;
        this.B = context;
        this.R = obj2;
    }

    public /* synthetic */ t00(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }
}
