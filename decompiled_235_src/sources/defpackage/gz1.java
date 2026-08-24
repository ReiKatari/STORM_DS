package defpackage;

import java.util.Map;
import me.magnum.melonds.domain.model.RendererConfiguration;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gz1  reason: default package */
/* loaded from: classes.dex */
public final class gz1 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ sz1 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gz1(int i, r41 r41Var, sz1 sz1Var) {
        super(2, r41Var);
        this.X = i;
        this.Z = sz1Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                ((gz1) q((r41) obj2, (p66) obj)).s(jg7Var);
                return jg7Var;
            case 1:
                ((gz1) q((r41) obj2, (p66) obj)).s(jg7Var);
                return jg7Var;
            case 2:
                ((gz1) q((r41) obj2, (jq1) obj)).s(jg7Var);
                return jg7Var;
            default:
                ((gz1) q((r41) obj2, (vr4) obj)).s(jg7Var);
                return jg7Var;
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        sz1 sz1Var = this.Z;
        switch (i) {
            case 0:
                gz1 gz1Var = new gz1(0, r41Var, sz1Var);
                gz1Var.Y = obj;
                return gz1Var;
            case 1:
                gz1 gz1Var2 = new gz1(1, r41Var, sz1Var);
                gz1Var2.Y = obj;
                return gz1Var2;
            case 2:
                gz1 gz1Var3 = new gz1(2, r41Var, sz1Var);
                gz1Var3.Y = obj;
                return gz1Var3;
            default:
                gz1 gz1Var4 = new gz1(3, r41Var, sz1Var);
                gz1Var4.Y = obj;
                return gz1Var4;
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        boolean z;
        VideoFiltering videoFiltering;
        po5 retroArchShader;
        int i = this.X;
        jg7 jg7Var = jg7.a;
        sz1 sz1Var = this.Z;
        Object obj2 = this.Y;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                sz1Var.j1.l((p66) obj2);
                return jg7Var;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                sz1Var.l1.l((p66) obj2);
                return jg7Var;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                sz1Var.X0.l((jq1) obj2);
                return jg7Var;
            default:
                vr4 vr4Var = (vr4) obj2;
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                RendererConfiguration rendererConfiguration = (RendererConfiguration) vr4Var.A;
                if (((Boolean) vr4Var.B).booleanValue() && rendererConfiguration.getVideoFiltering() == VideoFiltering.RETROARCH) {
                    z = true;
                } else {
                    z = false;
                }
                tp6 tp6Var = sz1Var.x0;
                VideoRenderer renderer = rendererConfiguration.getRenderer();
                if (z) {
                    videoFiltering = VideoFiltering.NONE;
                } else {
                    videoFiltering = rendererConfiguration.getVideoFiltering();
                }
                int resolutionScaling = rendererConfiguration.getResolutionScaling();
                if (z) {
                    po5 retroArchShader2 = rendererConfiguration.getRetroArchShader();
                    hp5 hp5Var = retroArchShader2.b;
                    int i2 = retroArchShader2.c;
                    long j = retroArchShader2.d;
                    Map map = retroArchShader2.e;
                    boolean z2 = retroArchShader2.f;
                    hp5Var.getClass();
                    map.getClass();
                    retroArchShader = new po5(null, hp5Var, i2, j, map, z2);
                } else {
                    retroArchShader = rendererConfiguration.getRetroArchShader();
                }
                b36 b36Var = new b36(renderer, videoFiltering, resolutionScaling, retroArchShader);
                tp6Var.getClass();
                tp6Var.m(null, b36Var);
                return jg7Var;
        }
    }
}
