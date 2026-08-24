package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import me.magnum.melonds.database.MelonDatabase;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ct5  reason: default package */
/* loaded from: classes.dex */
public final class ct5 extends hw6 implements eo2 {
    public final /* synthetic */ int X = 1;
    public int Y;
    public final /* synthetic */ hp0 Z;
    public final /* synthetic */ Context d0;
    public final /* synthetic */ w61 e0;
    public final /* synthetic */ pq5 f0;
    public final /* synthetic */ MelonDatabase g0;
    public final /* synthetic */ qa4 h0;
    public final /* synthetic */ qa4 i0;
    public final /* synthetic */ qa4 j0;
    public final /* synthetic */ qa4 k0;
    public final /* synthetic */ om6 l0;
    public final /* synthetic */ Object m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct5(hp0 hp0Var, Uri uri, Context context, w61 w61Var, pq5 pq5Var, MelonDatabase melonDatabase, qa4 qa4Var, qa4 qa4Var2, qa4 qa4Var3, qa4 qa4Var4, om6 om6Var, r41 r41Var) {
        super(2, r41Var);
        this.Z = hp0Var;
        this.m0 = uri;
        this.d0 = context;
        this.e0 = w61Var;
        this.f0 = pq5Var;
        this.g0 = melonDatabase;
        this.h0 = qa4Var;
        this.i0 = qa4Var2;
        this.j0 = qa4Var3;
        this.k0 = qa4Var4;
        this.l0 = om6Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((ct5) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((ct5) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.m0;
        switch (i) {
            case 0:
                om6 om6Var = this.l0;
                return new ct5(this.f0, this.g0, this.d0, this.Z, this.h0, this.i0, this.e0, this.j0, this.k0, (qa4) obj2, om6Var, r41Var);
            default:
                qa4 qa4Var = this.k0;
                om6 om6Var2 = this.l0;
                return new ct5(this.Z, (Uri) obj2, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, qa4Var, om6Var2, r41Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
        if (r0 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ad, code lost:
        if (r8 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
        if (r0 == r9) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v3, types: [zg5, java.lang.Object] */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        String c0;
        Object d0;
        String str;
        jv2 jv2Var;
        bt5 bt5Var;
        int i = this.X;
        jg7 jg7Var = jg7.a;
        Context context = this.d0;
        Object obj2 = this.m0;
        hp0 hp0Var = this.Z;
        String str2 = null;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                qa4 qa4Var = this.h0;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            oi2.Y(obj);
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    d0 = obj;
                } else {
                    oi2.Y(obj);
                    lx5 lx5Var = (lx5) qa4Var.getValue();
                    pq5 pq5Var = this.f0;
                    if (lx5Var != null && (c0 = lx5Var.a) != null) {
                        if (qs6.v0(c0)) {
                            c0 = null;
                            break;
                        }
                    }
                    c0 = vy7.c0(pq5Var);
                    String str3 = c0;
                    lx5 lx5Var2 = (lx5) qa4Var.getValue();
                    if (lx5Var2 != null && (str = lx5Var2.c) != null) {
                        if (!qs6.v0(str)) {
                            str2 = str;
                            break;
                        }
                    }
                    str2 = hf.k0(pq5Var);
                    String str4 = str2;
                    this.Y = 1;
                    xe1 xe1Var = xk1.a;
                    d0 = hv.d0(de1.L, new ja1(str3, "", this.g0, str4, (r41) null), this);
                    break;
                }
                boolean booleanValue = ((Boolean) d0).booleanValue();
                ?? obj3 = new Object();
                List<String> c02 = hf.c0("https://raw.githubusercontent.com/libretro/libretro-database/master/cht/Nintendo%20-%20Nintendo%20DS/Pokemon%20-%20HeartGold%20Version%20(USA).cht", "https://raw.githubusercontent.com/ahezard/nds-rom-info/master/usrcheat.dat");
                wk4 wk4Var = new wk4();
                wk4Var.i = true;
                wk4Var.j = true;
                wk4Var.a(10L);
                wk4Var.b(30L);
                xk4 xk4Var = new xk4(wk4Var);
                for (String str5 : c02) {
                    try {
                        s9 s9Var = new s9(13);
                        s9Var.I(str5);
                        s9Var.B("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
                        wl5 e = new je5(xk4Var, new pa(s9Var), false).e();
                        if (e.m0 && e.Z != null) {
                            File file = new File(context.getCacheDir(), "usrcheat_downloaded.dat");
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            yl5 yl5Var = e.Z;
                            yl5Var.getClass();
                            fileOutputStream.write(yl5Var.e());
                            fileOutputStream.close();
                            Uri fromFile = Uri.fromFile(file);
                            fromFile.getClass();
                            ((h16) hp0Var).l(fromFile);
                            obj3.A = true;
                            xe1 xe1Var2 = xk1.a;
                            jv2Var = e04.a;
                            bt5Var = new bt5(booleanValue, obj3, this.d0, this.i0, this.e0, this.f0, this.g0, this.Z, this.j0, qa4Var, this.k0, (qa4) obj2, this.l0, null);
                            this.Y = 2;
                            if (hv.d0(jv2Var, bt5Var, this) != x61Var) {
                                return jg7Var;
                            }
                            return x61Var;
                        }
                    } catch (Throwable unused) {
                    }
                }
                xe1 xe1Var22 = xk1.a;
                jv2Var = e04.a;
                bt5Var = new bt5(booleanValue, obj3, this.d0, this.i0, this.e0, this.f0, this.g0, this.Z, this.j0, qa4Var, this.k0, (qa4) obj2, this.l0, null);
                this.Y = 2;
                if (hv.d0(jv2Var, bt5Var, this) != x61Var) {
                }
                return x61Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ((h16) hp0Var).l((Uri) obj2);
                    xe1 xe1Var3 = xk1.a;
                    jv2 jv2Var2 = e04.a;
                    jn2 jn2Var = new jn2(context, null, 1);
                    this.Y = 1;
                    if (hv.d0(jv2Var2, jn2Var, this) == x61Var2) {
                        return x61Var2;
                    }
                }
                vy7.H(this.Z, this.e0, this.h0, this.i0, this.j0, this.k0, this.f0, this.l0, this.d0, this.g0);
                return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct5(pq5 pq5Var, MelonDatabase melonDatabase, Context context, hp0 hp0Var, qa4 qa4Var, qa4 qa4Var2, w61 w61Var, qa4 qa4Var3, qa4 qa4Var4, qa4 qa4Var5, om6 om6Var, r41 r41Var) {
        super(2, r41Var);
        this.f0 = pq5Var;
        this.g0 = melonDatabase;
        this.d0 = context;
        this.Z = hp0Var;
        this.h0 = qa4Var;
        this.i0 = qa4Var2;
        this.e0 = w61Var;
        this.j0 = qa4Var3;
        this.k0 = qa4Var4;
        this.m0 = qa4Var5;
        this.l0 = om6Var;
    }
}
