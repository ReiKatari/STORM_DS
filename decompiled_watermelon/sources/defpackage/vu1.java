package defpackage;

import java.util.Map;
import me.magnum.melonds.domain.model.RendererConfiguration;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vu1  reason: default package */
/* loaded from: classes.dex */
public final class vu1 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ hv1 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vu1(int i, j11 j11Var, hv1 hv1Var) {
        super(2, j11Var);
        this.X = i;
        this.Z = hv1Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                ((vu1) t((j11) obj2, (gv5) obj)).v(o27Var);
                return o27Var;
            case 1:
                ((vu1) t((j11) obj2, (gv5) obj)).v(o27Var);
                return o27Var;
            case 2:
                ((vu1) t((j11) obj2, (cm1) obj)).v(o27Var);
                return o27Var;
            default:
                ((vu1) t((j11) obj2, (ti4) obj)).v(o27Var);
                return o27Var;
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        hv1 hv1Var = this.Z;
        switch (i) {
            case 0:
                vu1 vu1Var = new vu1(0, j11Var, hv1Var);
                vu1Var.Y = obj;
                return vu1Var;
            case 1:
                vu1 vu1Var2 = new vu1(1, j11Var, hv1Var);
                vu1Var2.Y = obj;
                return vu1Var2;
            case 2:
                vu1 vu1Var3 = new vu1(2, j11Var, hv1Var);
                vu1Var3.Y = obj;
                return vu1Var3;
            default:
                vu1 vu1Var4 = new vu1(3, j11Var, hv1Var);
                vu1Var4.Y = obj;
                return vu1Var4;
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        boolean z;
        VideoFiltering videoFiltering;
        ue5 retroArchShader;
        int i = this.X;
        o27 o27Var = o27.a;
        hv1 hv1Var = this.Z;
        Object obj2 = this.Y;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                hv1Var.j1.k((gv5) obj2);
                return o27Var;
            case 1:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                hv1Var.l1.k((gv5) obj2);
                return o27Var;
            case 2:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                hv1Var.X0.k((cm1) obj2);
                return o27Var;
            default:
                ti4 ti4Var = (ti4) obj2;
                p31 p31Var4 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                RendererConfiguration rendererConfiguration = (RendererConfiguration) ti4Var.A;
                if (((Boolean) ti4Var.B).booleanValue() && rendererConfiguration.getVideoFiltering() == VideoFiltering.RETROARCH) {
                    z = true;
                } else {
                    z = false;
                }
                ee6 ee6Var = hv1Var.x0;
                VideoRenderer renderer = rendererConfiguration.getRenderer();
                if (z) {
                    videoFiltering = VideoFiltering.NONE;
                } else {
                    videoFiltering = rendererConfiguration.getVideoFiltering();
                }
                int resolutionScaling = rendererConfiguration.getResolutionScaling();
                if (z) {
                    ue5 retroArchShader2 = rendererConfiguration.getRetroArchShader();
                    lf5 lf5Var = retroArchShader2.b;
                    int i2 = retroArchShader2.c;
                    long j = retroArchShader2.d;
                    Map map = retroArchShader2.e;
                    boolean z2 = retroArchShader2.f;
                    lf5Var.getClass();
                    map.getClass();
                    retroArchShader = new ue5(null, lf5Var, i2, j, map, z2);
                } else {
                    retroArchShader = rendererConfiguration.getRetroArchShader();
                }
                js5 js5Var = new js5(renderer, videoFiltering, resolutionScaling, retroArchShader);
                ee6Var.getClass();
                ee6Var.l(null, js5Var);
                return o27Var;
        }
    }
}
