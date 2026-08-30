package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fl2  reason: default package */
/* loaded from: classes.dex */
public final class fl2 implements qx3 {
    public static final fl2 b = new fl2(0);
    public final /* synthetic */ int a;

    public /* synthetic */ fl2(int i) {
        this.a = i;
    }

    @Override // defpackage.qx3
    public final j45 a(Class cls) {
        switch (this.a) {
            case 0:
                if (jl2.class.isAssignableFrom(cls)) {
                    try {
                        return (j45) jl2.g(cls.asSubclass(jl2.class)).f(il2.BUILD_MESSAGE_INFO);
                    } catch (Exception e) {
                        c44.o("Unable to get message info for ".concat(cls.getName()), e);
                        return null;
                    }
                }
                i.i("Unsupported message type: ".concat(cls.getName()));
                return null;
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.qx3
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return jl2.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
