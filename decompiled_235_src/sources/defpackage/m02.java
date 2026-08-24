package defpackage;

import android.util.Log;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.MicSource;
import me.magnum.melonds.domain.model.RendererConfiguration;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.domain.model.VulkanPipelineProfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m02  reason: default package */
/* loaded from: classes.dex */
public final class m02 extends hw6 implements fo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m02(bx4 bx4Var, r41 r41Var) {
        super(3, r41Var);
        this.X = 1;
        this.Z = bx4Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                m02 m02Var = new m02(3, (r41) obj3, 0);
                m02Var.Y = (u41) obj;
                m02Var.Z = (pq5) obj2;
                return m02Var.s(jg7Var);
            case 1:
                ne2 ne2Var = (ne2) obj;
                m02 m02Var2 = new m02((bx4) this.Z, (r41) obj3);
                m02Var2.Y = (Throwable) obj2;
                m02Var2.s(jg7Var);
                return jg7Var;
            case 2:
                m02 m02Var3 = new m02(3, (r41) obj3, 2);
                m02Var3.Y = (ConsoleType) obj;
                m02Var3.Z = (MicSource) obj2;
                return m02Var3.s(jg7Var);
            case 3:
                m02 m02Var4 = new m02(3, (r41) obj3, 3);
                m02Var4.Y = (yf6) obj;
                m02Var4.Z = (po5) obj2;
                return m02Var4.s(jg7Var);
            default:
                m02 m02Var5 = new m02(3, (r41) obj3, 4);
                m02Var5.Y = (wf6) obj;
                m02Var5.Z = (xf6) obj2;
                return m02Var5.s(jg7Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        jt5 jt5Var;
        u41 u41Var;
        VideoFiltering videoFiltering;
        String str;
        VideoFiltering videoFiltering2;
        VideoRenderer videoRenderer;
        boolean z;
        VulkanPipelineProfile vulkanPipelineProfile;
        po5 po5Var;
        switch (this.X) {
            case 0:
                u41 u41Var2 = (u41) this.Y;
                pq5 pq5Var = (pq5) this.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (pq5Var != null && (jt5Var = pq5Var.f) != null) {
                    u41Var2.getClass();
                    if (jt5Var.g == nx5.CUSTOM && (u41Var = jt5Var.h) != null) {
                        return u41Var;
                    }
                    return u41Var2;
                }
                return u41Var2;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                Throwable th = (Throwable) this.Y;
                Log.e("PipePresenceSrc", "Error in camera ID flow collection.", th);
                bx4 bx4Var = (bx4) this.Z;
                if (bx4Var.h.get()) {
                    bx4Var.c(null, th);
                } else {
                    vy7.P(Log.d("PipePresenceSrc", "Ignoring error because monitoring is stopped."));
                }
                return jg7.a;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return new vr4((ConsoleType) this.Y, (MicSource) this.Z);
            case 3:
                yf6 yf6Var = (yf6) this.Y;
                po5 po5Var2 = (po5) this.Z;
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                wf6 wf6Var = yf6Var.a;
                xf6 xf6Var = yf6Var.b;
                VideoRenderer videoRenderer2 = wf6Var.a;
                VideoRenderer videoRenderer3 = VideoRenderer.VULKAN;
                if (videoRenderer2 == videoRenderer3 && !wf6Var.b.isSupportedByVulkan()) {
                    videoFiltering2 = VideoFiltering.NONE;
                } else {
                    VideoRenderer videoRenderer4 = wf6Var.a;
                    VideoFiltering videoFiltering3 = wf6Var.b;
                    if (videoRenderer4 != videoRenderer3 && !videoFiltering3.isSupportedByOpenGlSurface()) {
                        videoFiltering2 = VideoFiltering.NONE;
                    } else if (videoFiltering3 == VideoFiltering.RETROARCH && ((str = po5Var2.a) == null || qs6.v0(str))) {
                        videoFiltering2 = VideoFiltering.NONE;
                    } else {
                        videoFiltering = videoFiltering3;
                        boolean X = mp2.X(wf6Var.a, wf6Var.c);
                        videoRenderer = wf6Var.a;
                        if (videoRenderer != VideoRenderer.OPENGL && xf6Var.a) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean z2 = z;
                        if (videoRenderer != videoRenderer3) {
                            vulkanPipelineProfile = wf6Var.e;
                        } else {
                            vulkanPipelineProfile = VulkanPipelineProfile.COMPATIBILITY;
                        }
                        VulkanPipelineProfile vulkanPipelineProfile2 = vulkanPipelineProfile;
                        int i = wf6Var.d;
                        boolean z3 = wf6Var.f;
                        boolean z4 = wf6Var.g;
                        boolean z5 = wf6Var.h;
                        float f = xf6Var.b;
                        float f2 = xf6Var.c;
                        boolean z6 = xf6Var.d;
                        boolean z7 = xf6Var.e;
                        boolean z8 = xf6Var.f;
                        if (videoFiltering != VideoFiltering.RETROARCH) {
                            po5Var = po5Var2;
                        } else {
                            po5Var = ng6.l;
                        }
                        return new RendererConfiguration(videoRenderer, videoFiltering, X, vulkanPipelineProfile2, i, z3, z4, z5, z2, f, f2, z6, z7, z8, po5Var);
                    }
                }
                videoFiltering = videoFiltering2;
                boolean X2 = mp2.X(wf6Var.a, wf6Var.c);
                videoRenderer = wf6Var.a;
                if (videoRenderer != VideoRenderer.OPENGL) {
                }
                z = false;
                boolean z22 = z;
                if (videoRenderer != videoRenderer3) {
                }
                VulkanPipelineProfile vulkanPipelineProfile22 = vulkanPipelineProfile;
                int i2 = wf6Var.d;
                boolean z32 = wf6Var.f;
                boolean z42 = wf6Var.g;
                boolean z52 = wf6Var.h;
                float f3 = xf6Var.b;
                float f22 = xf6Var.c;
                boolean z62 = xf6Var.d;
                boolean z72 = xf6Var.e;
                boolean z82 = xf6Var.f;
                if (videoFiltering != VideoFiltering.RETROARCH) {
                }
                return new RendererConfiguration(videoRenderer, videoFiltering, X2, vulkanPipelineProfile22, i2, z32, z42, z52, z22, f3, f22, z62, z72, z82, po5Var);
            default:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return new yf6((wf6) this.Y, (xf6) this.Z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m02(int i, r41 r41Var, int i2) {
        super(i, r41Var);
        this.X = i2;
    }
}
