package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ha4  reason: default package */
/* loaded from: classes.dex */
public final class ha4 extends j45 implements eg3, fg3 {
    public ha4(String str, String str2) {
        super(kb0.A, eb6.class, str, str2, 1);
    }

    @Override // defpackage.lb0
    public final yf3 a() {
        gh5.a.getClass();
        return this;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        h();
        throw null;
    }

    @Override // defpackage.eg3
    public final Object get(Object obj) {
        throw null;
    }

    public final void h() {
        if (!this.Z) {
            yf3 f = f();
            if (f != this) {
                ((ha4) ((fg3) f)).h();
                return;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        fa6.h("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }
}
