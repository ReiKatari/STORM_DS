package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ss  reason: default package */
/* loaded from: classes.dex */
public class ss extends defpackage.us {
    public ss() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.us
    public void a(android.text.StaticLayout.Builder r2, android.widget.TextView r3) {
            r1 = this;
            java.lang.String r1 = "getTextDirectionHeuristic"
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            java.lang.Object r1 = defpackage.vs.e(r3, r0, r1)
            android.text.TextDirectionHeuristic r1 = (android.text.TextDirectionHeuristic) r1
            r2.setTextDirection(r1)
            return
    }
}
