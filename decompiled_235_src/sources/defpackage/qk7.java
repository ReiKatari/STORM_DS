package defpackage;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qk7  reason: default package */
/* loaded from: classes.dex */
public final class qk7 extends gk7 {
    public final mu2 b;
    public String c;
    public boolean d;
    public final jo1 e;
    public on2 f;
    public final vs4 g;
    public z40 h;
    public final vs4 i;
    public long j;
    public float k;
    public float l;
    public final pk7 m;

    public qk7(mu2 mu2Var) {
        this.b = mu2Var;
        mu2Var.i = new pk7(this, 0);
        this.c = "";
        this.d = true;
        this.e = new jo1();
        this.f = iy0.o0;
        this.g = np2.Y(null);
        this.i = np2.Y(new xi6(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new pk7(this, 1);
    }

    @Override // defpackage.gk7
    public final void a(no1 no1Var) {
        e(no1Var, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
        if (r3 != r8) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0108, code lost:
        if (r9.d == r3) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(no1 no1Var, float f, z40 z40Var) {
        int i;
        boolean z;
        jo1 jo1Var;
        z40 z40Var2;
        zh zhVar;
        char c;
        long j;
        z40 z40Var3;
        z40 z40Var4;
        zh zhVar2;
        zh zhVar3;
        int i2;
        int i3;
        int i4;
        mu2 mu2Var = this.b;
        boolean z2 = mu2Var.d;
        vs4 vs4Var = this.g;
        if (z2 && mu2Var.e != 16) {
            z40 z40Var5 = (z40) vs4Var.getValue();
            int i5 = el7.a;
            if (!(z40Var5 instanceof z40) ? z40Var5 == null : !((i4 = z40Var5.c) != 5 && i4 != 3)) {
                if (!(z40Var instanceof z40) ? z40Var == null : !((i3 = z40Var.c) != 5 && i3 != 3)) {
                    i = 1;
                    z = this.d;
                    jo1Var = this.e;
                    if (!z && xi6.b(this.j, no1Var.e())) {
                        zhVar3 = jo1Var.a;
                        if (zhVar3 == null) {
                            i2 = zhVar3.a();
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i != 1) {
                        long j2 = mu2Var.e;
                        int i6 = el7.a;
                        if (kt0.e(j2) != 1.0f) {
                            j2 = kt0.c(1.0f, j2);
                        }
                        z40Var2 = new z40(5, j2);
                    } else {
                        z40Var2 = null;
                    }
                    this.h = z40Var2;
                    float intBitsToFloat = Float.intBitsToFloat((int) (no1Var.e() >> 32));
                    vs4 vs4Var2 = this.i;
                    this.k = intBitsToFloat / Float.intBitsToFloat((int) (((xi6) vs4Var2.getValue()).a >> 32));
                    this.l = Float.intBitsToFloat((int) (no1Var.e() & 4294967295L)) / Float.intBitsToFloat((int) (((xi6) vs4Var2.getValue()).a & 4294967295L));
                    long ceil = (((int) Math.ceil(Float.intBitsToFloat((int) (no1Var.e() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (no1Var.e() & 4294967295L)))) & 4294967295L);
                    kk3 layoutDirection = no1Var.getLayoutDirection();
                    zhVar = jo1Var.a;
                    wd wdVar = jo1Var.b;
                    if (zhVar == null && wdVar != null) {
                        int i7 = (int) (ceil >> 32);
                        Bitmap bitmap = zhVar.a;
                        c = ' ';
                        j = 4294967295L;
                        if (i7 <= bitmap.getWidth()) {
                            if (((int) (ceil & 4294967295L)) <= bitmap.getHeight()) {
                            }
                        }
                    } else {
                        c = ' ';
                        j = 4294967295L;
                    }
                    zhVar = uj2.d((int) (ceil >> c), (int) (ceil & j), i, 24);
                    wdVar = ge7.c(zhVar);
                    jo1Var.a = zhVar;
                    jo1Var.b = wdVar;
                    jo1Var.d = i;
                    jo1Var.c = ceil;
                    zj0 zj0Var = jo1Var.e;
                    long S = qo2.S(ceil);
                    yj0 yj0Var = zj0Var.A;
                    qh1 qh1Var = yj0Var.a;
                    kk3 kk3Var = yj0Var.b;
                    xj0 xj0Var = yj0Var.c;
                    wd wdVar2 = wdVar;
                    long j3 = yj0Var.d;
                    yj0Var.a = no1Var;
                    yj0Var.b = layoutDirection;
                    yj0Var.c = wdVar2;
                    yj0Var.d = S;
                    wdVar2.h();
                    no1.F(zj0Var, kt0.b, 0L, 0L, RecyclerView.B1, null, 62);
                    this.m.g(zj0Var);
                    wdVar2.p();
                    yj0 yj0Var2 = zj0Var.A;
                    yj0Var2.a = qh1Var;
                    yj0Var2.b = kk3Var;
                    yj0Var2.c = xj0Var;
                    yj0Var2.d = j3;
                    zhVar.a.prepareToDraw();
                    this.d = false;
                    this.j = no1Var.e();
                    if (z40Var == null) {
                        z40Var4 = z40Var;
                    } else {
                        if (((z40) vs4Var.getValue()) != null) {
                            z40Var3 = (z40) vs4Var.getValue();
                        } else {
                            z40Var3 = this.h;
                        }
                        z40Var4 = z40Var3;
                    }
                    zhVar2 = jo1Var.a;
                    if (zhVar2 == null) {
                        p53.c("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                    }
                    no1.z(no1Var, zhVar2, jo1Var.c, 0L, f, z40Var4, 0, 858);
                }
            }
        }
        i = 0;
        z = this.d;
        jo1Var = this.e;
        if (!z) {
            zhVar3 = jo1Var.a;
            if (zhVar3 == null) {
            }
        }
        if (i != 1) {
        }
        this.h = z40Var2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (no1Var.e() >> 32));
        vs4 vs4Var22 = this.i;
        this.k = intBitsToFloat2 / Float.intBitsToFloat((int) (((xi6) vs4Var22.getValue()).a >> 32));
        this.l = Float.intBitsToFloat((int) (no1Var.e() & 4294967295L)) / Float.intBitsToFloat((int) (((xi6) vs4Var22.getValue()).a & 4294967295L));
        long ceil2 = (((int) Math.ceil(Float.intBitsToFloat((int) (no1Var.e() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (no1Var.e() & 4294967295L)))) & 4294967295L);
        kk3 layoutDirection2 = no1Var.getLayoutDirection();
        zhVar = jo1Var.a;
        wd wdVar3 = jo1Var.b;
        if (zhVar == null) {
        }
        c = ' ';
        j = 4294967295L;
        zhVar = uj2.d((int) (ceil2 >> c), (int) (ceil2 & j), i, 24);
        wdVar3 = ge7.c(zhVar);
        jo1Var.a = zhVar;
        jo1Var.b = wdVar3;
        jo1Var.d = i;
        jo1Var.c = ceil2;
        zj0 zj0Var2 = jo1Var.e;
        long S2 = qo2.S(ceil2);
        yj0 yj0Var3 = zj0Var2.A;
        qh1 qh1Var2 = yj0Var3.a;
        kk3 kk3Var2 = yj0Var3.b;
        xj0 xj0Var2 = yj0Var3.c;
        wd wdVar22 = wdVar3;
        long j32 = yj0Var3.d;
        yj0Var3.a = no1Var;
        yj0Var3.b = layoutDirection2;
        yj0Var3.c = wdVar22;
        yj0Var3.d = S2;
        wdVar22.h();
        no1.F(zj0Var2, kt0.b, 0L, 0L, RecyclerView.B1, null, 62);
        this.m.g(zj0Var2);
        wdVar22.p();
        yj0 yj0Var22 = zj0Var2.A;
        yj0Var22.a = qh1Var2;
        yj0Var22.b = kk3Var2;
        yj0Var22.c = xj0Var2;
        yj0Var22.d = j32;
        zhVar.a.prepareToDraw();
        this.d = false;
        this.j = no1Var.e();
        if (z40Var == null) {
        }
        zhVar2 = jo1Var.a;
        if (zhVar2 == null) {
        }
        no1.z(no1Var, zhVar2, jo1Var.c, 0L, f, z40Var4, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        vs4 vs4Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((xi6) vs4Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((xi6) vs4Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
