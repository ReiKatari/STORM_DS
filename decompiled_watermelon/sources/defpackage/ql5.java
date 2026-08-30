package defpackage;

import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ql5  reason: default package */
/* loaded from: classes.dex */
public final class ql5 extends nk6 implements dj2 {
    public /* synthetic */ VideoRenderer X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ int Z;
    public /* synthetic */ VideoFiltering c0;

    /* JADX WARN: Type inference failed for: r4v2, types: [nk6, ql5] */
    @Override // defpackage.dj2
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        int intValue = ((Number) obj3).intValue();
        ?? nk6Var = new nk6(5, (j11) obj5);
        nk6Var.X = (VideoRenderer) obj;
        nk6Var.Y = booleanValue;
        nk6Var.Z = intValue;
        nk6Var.c0 = (VideoFiltering) obj4;
        return nk6Var.v(o27.a);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        VideoRenderer videoRenderer = this.X;
        boolean z = this.Y;
        int i = this.Z;
        VideoFiltering videoFiltering = this.c0;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        return new nl5(videoRenderer, z, i, videoFiltering);
    }
}
