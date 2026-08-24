package androidx.profileinstaller;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements defpackage.j53 {
    public ProfileInstallerInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.j53
    public final java.util.List a() {
            r0 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    @Override // defpackage.j53
    public final java.lang.Object b(android.content.Context r3) {
            r2 = this;
            android.content.Context r3 = r3.getApplicationContext()
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            kv2 r1 = new kv2
            r1.<init>(r2, r3)
            r0.postFrameCallback(r1)
            q61 r2 = new q61
            r2.<init>()
            return r2
    }
}
