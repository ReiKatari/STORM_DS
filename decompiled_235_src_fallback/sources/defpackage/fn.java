package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fn  reason: default package */
/* loaded from: classes.dex */
public final class fn extends android.graphics.drawable.Animatable2.AnimationCallback {
    public final /* synthetic */ defpackage.g24 a;

    public fn(defpackage.g24 r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(android.graphics.drawable.Drawable r1) {
            r0 = this;
            g24 r0 = r0.a
            i24 r0 = r0.b
            android.content.res.ColorStateList r0 = r0.n0
            if (r0 == 0) goto Lb
            r1.setTintList(r0)
        Lb:
            return
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(android.graphics.drawable.Drawable r1) {
            r0 = this;
            g24 r0 = r0.a
            r0.a(r1)
            return
    }
}
