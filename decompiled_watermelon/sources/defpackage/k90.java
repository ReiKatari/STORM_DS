package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k90  reason: default package */
/* loaded from: classes.dex */
public final class k90 extends q1 {
    public final /* synthetic */ l90 c0;

    public k90(l90 l90Var) {
        this.c0 = l90Var;
    }

    @Override // defpackage.q1
    public final String g() {
        i90 i90Var = (i90) this.c0.A.get();
        if (i90Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + i90Var.a + "]";
    }
}
