package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lr2  reason: default package */
/* loaded from: classes.dex */
public final class lr2 implements h54 {
    public static final lr2 b = new lr2(0);
    public final /* synthetic */ int a;

    public /* synthetic */ lr2(int i) {
        this.a = i;
    }

    @Override // defpackage.h54
    public final wd5 a(Class cls) {
        switch (this.a) {
            case 0:
                if (pr2.class.isAssignableFrom(cls)) {
                    try {
                        return (wd5) pr2.g(cls.asSubclass(pr2.class)).f(or2.BUILD_MESSAGE_INFO);
                    } catch (Exception e) {
                        u34.p("Unable to get message info for ".concat(cls.getName()), e);
                        return null;
                    }
                }
                i.h("Unsupported message type: ".concat(cls.getName()));
                return null;
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.h54
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return pr2.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
