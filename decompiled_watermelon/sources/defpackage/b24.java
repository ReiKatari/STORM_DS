package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b24  reason: default package */
/* loaded from: classes.dex */
public final class b24 extends cv4 implements k93, l93 {
    public b24(String str, String str2) {
        super(c90.A, pz5.class, str, str2, 1);
    }

    @Override // defpackage.d90
    public final e93 a() {
        q75.a.getClass();
        return this;
    }

    public final void g() {
        if (!this.Z) {
            e93 d = d();
            if (d != this) {
                ((b24) ((l93) d)).g();
                return;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        vd6.i("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }

    @Override // defpackage.k93
    public final Object get(Object obj) {
        throw null;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        g();
        throw null;
    }
}
