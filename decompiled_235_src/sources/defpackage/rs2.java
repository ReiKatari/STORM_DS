package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rs2  reason: default package */
/* loaded from: classes.dex */
public final class rs2 extends zg1 implements mo1 {
    public final /* synthetic */ int m0 = 1;
    public final sg n0;
    public final mr1 o0;
    public Object p0;

    public rs2(ow6 ow6Var, sg sgVar, mr1 mr1Var, lq4 lq4Var) {
        this.n0 = sgVar;
        this.o0 = mr1Var;
        this.p0 = lq4Var;
        R0(ow6Var);
    }

    public static boolean U0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == RecyclerView.B1) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean V0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public RenderNode W0() {
        RenderNode renderNode = (RenderNode) this.p0;
        if (renderNode == null) {
            RenderNode e = r74.e();
            this.p0 = e;
            return e;
        }
        return renderNode;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02e0  */
    @Override // defpackage.mo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m0(um3 um3Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        char c;
        RecordingCanvas beginRecording;
        boolean z5;
        boolean z6;
        Canvas canvas;
        float f;
        float f2;
        wd wdVar;
        qh1 I;
        kk3 K;
        xj0 G;
        long L;
        ut2 ut2Var;
        boolean z7;
        float f3;
        float f4;
        float f5;
        float f6;
        int i = this.m0;
        sg sgVar = this.n0;
        mr1 mr1Var = this.o0;
        switch (i) {
            case 0:
                lq4 lq4Var = (lq4) this.p0;
                zj0 zj0Var = um3Var.A;
                sgVar.i(zj0Var.e());
                if (xi6.f(zj0Var.e())) {
                    um3Var.b();
                    return;
                }
                um3Var.b();
                sgVar.d.getValue();
                Canvas a = xd.a(zj0Var.B.G());
                if (mr1.f(mr1Var.f)) {
                    EdgeEffect c2 = mr1Var.c();
                    float e0 = um3Var.e0(lq4Var.b(um3Var.getLayoutDirection()));
                    z = V0(270.0f, (Float.floatToRawIntBits(e0) & 4294967295L) | (Float.floatToRawIntBits(-Float.intBitsToFloat((int) (zj0Var.e() & 4294967295L))) << 32), c2, a);
                } else {
                    z = false;
                }
                if (mr1.f(mr1Var.d)) {
                    if (!V0(RecyclerView.B1, (Float.floatToRawIntBits(um3Var.e0(lq4Var.d())) & 4294967295L) | (Float.floatToRawIntBits(RecyclerView.B1) << 32), mr1Var.e(), a) && !z) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (mr1.f(mr1Var.g)) {
                    EdgeEffect d = mr1Var.d();
                    int E = u24.E(Float.intBitsToFloat((int) (zj0Var.e() >> 32)));
                    if (!V0(90.0f, (Float.floatToRawIntBits(um3Var.e0(lq4Var.c(um3Var.getLayoutDirection())) + (-E)) & 4294967295L) | (Float.floatToRawIntBits(RecyclerView.B1) << 32), d, a) && !z) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (mr1.f(mr1Var.e)) {
                    if (!V0(180.0f, (Float.floatToRawIntBits(-Float.intBitsToFloat((int) (zj0Var.e() >> 32))) << 32) | (Float.floatToRawIntBits((-Float.intBitsToFloat((int) (zj0Var.e() & 4294967295L))) + um3Var.e0(lq4Var.a())) & 4294967295L), mr1Var.b(), a) && !z) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    z = z2;
                }
                if (z) {
                    sgVar.d();
                    return;
                }
                return;
            default:
                zj0 zj0Var2 = um3Var.A;
                sgVar.i(zj0Var2.e());
                Canvas a2 = xd.a(zj0Var2.B.G());
                sgVar.d.getValue();
                if (xi6.f(zj0Var2.e())) {
                    um3Var.b();
                    return;
                } else if (!a2.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = mr1Var.d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = mr1Var.e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = mr1Var.f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = mr1Var.g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = mr1Var.h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = mr1Var.i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = mr1Var.j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = mr1Var.k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    um3Var.b();
                    return;
                } else {
                    float e02 = um3Var.e0(30.0f);
                    if (!mr1.f(mr1Var.d) && !mr1.g(mr1Var.h) && !mr1.f(mr1Var.e) && !mr1.g(mr1Var.i)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!mr1.f(mr1Var.f) && !mr1.g(mr1Var.j) && !mr1.f(mr1Var.g) && !mr1.g(mr1Var.k)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z3 && z4) {
                        j = 4294967295L;
                        c = ' ';
                        W0().setPosition(0, 0, a2.getWidth(), a2.getHeight());
                    } else {
                        j = 4294967295L;
                        c = ' ';
                        if (z3) {
                            W0().setPosition(0, 0, (u24.E(e02) * 2) + a2.getWidth(), a2.getHeight());
                        } else if (z4) {
                            W0().setPosition(0, 0, a2.getWidth(), (u24.E(e02) * 2) + a2.getHeight());
                        } else {
                            um3Var.b();
                            return;
                        }
                    }
                    beginRecording = W0().beginRecording();
                    if (mr1.g(mr1Var.j)) {
                        EdgeEffect edgeEffect9 = mr1Var.j;
                        if (edgeEffect9 == null) {
                            edgeEffect9 = mr1Var.a(lo4.Horizontal);
                            mr1Var.j = edgeEffect9;
                        }
                        U0(90.0f, edgeEffect9, beginRecording);
                        edgeEffect9.finish();
                    }
                    if (mr1.f(mr1Var.f)) {
                        EdgeEffect c3 = mr1Var.c();
                        z6 = U0(270.0f, c3, beginRecording);
                        if (mr1.g(mr1Var.f)) {
                            z5 = z4;
                            float intBitsToFloat = Float.intBitsToFloat((int) (sgVar.c() & j));
                            EdgeEffect edgeEffect10 = mr1Var.j;
                            if (edgeEffect10 == null) {
                                edgeEffect10 = mr1Var.a(lo4.Horizontal);
                                mr1Var.j = edgeEffect10;
                            }
                            int i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 31) {
                                f6 = up.e(c3);
                            } else {
                                f6 = RecyclerView.B1;
                            }
                            float f7 = 1.0f - intBitsToFloat;
                            if (i2 >= 31) {
                                up.g(edgeEffect10, f6, f7);
                            } else {
                                edgeEffect10.onPull(f6, f7);
                            }
                        } else {
                            z5 = z4;
                        }
                    } else {
                        z5 = z4;
                        z6 = false;
                    }
                    if (mr1.g(mr1Var.h)) {
                        EdgeEffect edgeEffect11 = mr1Var.h;
                        if (edgeEffect11 == null) {
                            edgeEffect11 = mr1Var.a(lo4.Vertical);
                            mr1Var.h = edgeEffect11;
                        }
                        U0(180.0f, edgeEffect11, beginRecording);
                        edgeEffect11.finish();
                    }
                    try {
                        if (mr1.f(mr1Var.d)) {
                            EdgeEffect e = mr1Var.e();
                            if (!U0(RecyclerView.B1, e, beginRecording) && !z6) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            if (mr1.g(mr1Var.d)) {
                                canvas = a2;
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (sgVar.c() >> c));
                                EdgeEffect edgeEffect12 = mr1Var.h;
                                if (edgeEffect12 == null) {
                                    edgeEffect12 = mr1Var.a(lo4.Vertical);
                                    mr1Var.h = edgeEffect12;
                                }
                                int i3 = Build.VERSION.SDK_INT;
                                if (i3 >= 31) {
                                    f5 = up.e(e);
                                } else {
                                    f5 = RecyclerView.B1;
                                }
                                if (i3 >= 31) {
                                    up.g(edgeEffect12, f5, intBitsToFloat2);
                                } else {
                                    edgeEffect12.onPull(f5, intBitsToFloat2);
                                }
                                if (mr1.g(mr1Var.k)) {
                                    EdgeEffect edgeEffect13 = mr1Var.k;
                                    if (edgeEffect13 == null) {
                                        edgeEffect13 = mr1Var.a(lo4.Horizontal);
                                        mr1Var.k = edgeEffect13;
                                    }
                                    U0(270.0f, edgeEffect13, beginRecording);
                                    edgeEffect13.finish();
                                }
                                if (mr1.f(mr1Var.g)) {
                                    EdgeEffect d2 = mr1Var.d();
                                    if (!U0(90.0f, d2, beginRecording) && !z6) {
                                        z6 = false;
                                    } else {
                                        z6 = true;
                                    }
                                    if (mr1.g(mr1Var.g)) {
                                        float intBitsToFloat3 = Float.intBitsToFloat((int) (sgVar.c() & j));
                                        EdgeEffect edgeEffect14 = mr1Var.k;
                                        if (edgeEffect14 == null) {
                                            edgeEffect14 = mr1Var.a(lo4.Horizontal);
                                            mr1Var.k = edgeEffect14;
                                        }
                                        int i4 = Build.VERSION.SDK_INT;
                                        if (i4 >= 31) {
                                            f4 = up.e(d2);
                                        } else {
                                            f4 = RecyclerView.B1;
                                        }
                                        if (i4 >= 31) {
                                            up.g(edgeEffect14, f4, intBitsToFloat3);
                                        } else {
                                            edgeEffect14.onPull(f4, intBitsToFloat3);
                                        }
                                    }
                                }
                                if (mr1.g(mr1Var.i)) {
                                    EdgeEffect edgeEffect15 = mr1Var.i;
                                    if (edgeEffect15 == null) {
                                        edgeEffect15 = mr1Var.a(lo4.Vertical);
                                        mr1Var.i = edgeEffect15;
                                    }
                                    U0(RecyclerView.B1, edgeEffect15, beginRecording);
                                    edgeEffect15.finish();
                                }
                                if (mr1.f(mr1Var.e)) {
                                    EdgeEffect b = mr1Var.b();
                                    if (!U0(180.0f, b, beginRecording) && !z6) {
                                        z7 = false;
                                    } else {
                                        z7 = true;
                                    }
                                    if (mr1.g(mr1Var.e)) {
                                        float intBitsToFloat4 = Float.intBitsToFloat((int) (sgVar.c() >> c));
                                        EdgeEffect edgeEffect16 = mr1Var.i;
                                        if (edgeEffect16 == null) {
                                            edgeEffect16 = mr1Var.a(lo4.Vertical);
                                            mr1Var.i = edgeEffect16;
                                        }
                                        int i5 = Build.VERSION.SDK_INT;
                                        if (i5 >= 31) {
                                            f3 = up.e(b);
                                        } else {
                                            f3 = RecyclerView.B1;
                                        }
                                        float f8 = 1.0f - intBitsToFloat4;
                                        if (i5 >= 31) {
                                            up.g(edgeEffect16, f3, f8);
                                        } else {
                                            edgeEffect16.onPull(f3, f8);
                                        }
                                    }
                                    z6 = z7;
                                }
                                if (z6) {
                                    sgVar.d();
                                }
                                if (!z5) {
                                    f = RecyclerView.B1;
                                } else {
                                    f = e02;
                                }
                                if (!z3) {
                                    f2 = RecyclerView.B1;
                                } else {
                                    f2 = e02;
                                }
                                kk3 layoutDirection = um3Var.getLayoutDirection();
                                wdVar = new wd();
                                wdVar.a = beginRecording;
                                long e2 = zj0Var2.e();
                                I = zj0Var2.B.I();
                                K = zj0Var2.B.K();
                                G = zj0Var2.B.G();
                                L = zj0Var2.B.L();
                                bt btVar = zj0Var2.B;
                                Canvas canvas2 = canvas;
                                ut2Var = (ut2) btVar.L;
                                btVar.W(um3Var);
                                btVar.X(layoutDirection);
                                btVar.V(wdVar);
                                btVar.Y(e2);
                                btVar.L = null;
                                wdVar.h();
                                ((os0) zj0Var2.B.B).g0(f, f2);
                                um3Var.b();
                                float f9 = -f;
                                float f10 = -f2;
                                ((os0) zj0Var2.B.B).g0(f9, f10);
                                wdVar.p();
                                bt btVar2 = zj0Var2.B;
                                btVar2.W(I);
                                btVar2.X(K);
                                btVar2.V(G);
                                btVar2.Y(L);
                                btVar2.L = ut2Var;
                                W0().endRecording();
                                int save = canvas2.save();
                                canvas2.translate(f9, f10);
                                canvas2.drawRenderNode(W0());
                                canvas2.restoreToCount(save);
                                return;
                            }
                        }
                        ((os0) zj0Var2.B.B).g0(f, f2);
                        um3Var.b();
                        float f92 = -f;
                        float f102 = -f2;
                        ((os0) zj0Var2.B.B).g0(f92, f102);
                        wdVar.p();
                        bt btVar22 = zj0Var2.B;
                        btVar22.W(I);
                        btVar22.X(K);
                        btVar22.V(G);
                        btVar22.Y(L);
                        btVar22.L = ut2Var;
                        W0().endRecording();
                        int save2 = canvas2.save();
                        canvas2.translate(f92, f102);
                        canvas2.drawRenderNode(W0());
                        canvas2.restoreToCount(save2);
                        return;
                    } catch (Throwable th) {
                        wdVar.p();
                        bt btVar3 = zj0Var2.B;
                        btVar3.W(I);
                        btVar3.X(K);
                        btVar3.V(G);
                        btVar3.Y(L);
                        btVar3.L = ut2Var;
                        throw th;
                    }
                    canvas = a2;
                    if (mr1.g(mr1Var.k)) {
                    }
                    if (mr1.f(mr1Var.g)) {
                    }
                    if (mr1.g(mr1Var.i)) {
                    }
                    if (mr1.f(mr1Var.e)) {
                    }
                    if (z6) {
                    }
                    if (!z5) {
                    }
                    if (!z3) {
                    }
                    kk3 layoutDirection2 = um3Var.getLayoutDirection();
                    wdVar = new wd();
                    wdVar.a = beginRecording;
                    long e22 = zj0Var2.e();
                    I = zj0Var2.B.I();
                    K = zj0Var2.B.K();
                    G = zj0Var2.B.G();
                    L = zj0Var2.B.L();
                    bt btVar4 = zj0Var2.B;
                    Canvas canvas22 = canvas;
                    ut2Var = (ut2) btVar4.L;
                    btVar4.W(um3Var);
                    btVar4.X(layoutDirection2);
                    btVar4.V(wdVar);
                    btVar4.Y(e22);
                    btVar4.L = null;
                    wdVar.h();
                }
                break;
        }
    }

    public rs2(ow6 ow6Var, sg sgVar, mr1 mr1Var) {
        this.n0 = sgVar;
        this.o0 = mr1Var;
        R0(ow6Var);
    }
}
