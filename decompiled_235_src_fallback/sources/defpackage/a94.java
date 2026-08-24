package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a94  reason: default package */
/* loaded from: classes.dex */
public final class a94 implements android.content.DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ defpackage.b94 a;

    public a94(defpackage.b94 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(android.content.DialogInterface r2, int r3, boolean r4) {
            r1 = this;
            b94 r1 = r1.a
            java.util.HashSet r2 = r1.e0
            boolean r0 = r1.f0
            if (r4 == 0) goto L18
            java.lang.CharSequence[] r4 = r1.h0
            r3 = r4[r3]
            java.lang.String r3 = r3.toString()
            boolean r2 = r2.add(r3)
            r2 = r2 | r0
            r1.f0 = r2
            return
        L18:
            java.lang.CharSequence[] r4 = r1.h0
            r3 = r4[r3]
            java.lang.String r3 = r3.toString()
            boolean r2 = r2.remove(r3)
            r2 = r2 | r0
            r1.f0 = r2
            return
    }
}
