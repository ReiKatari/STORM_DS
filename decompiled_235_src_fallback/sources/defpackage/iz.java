package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iz  reason: default package */
/* loaded from: classes.dex */
public final class iz extends android.view.autofill.AutofillManager$AutofillCallback {
    public static final defpackage.iz a = null;

    static {
            iz r0 = new iz
            r0.<init>()
            defpackage.iz.a = r0
            return
    }

    public final void onAutofillEvent(android.view.View r1, int r2, int r3) {
            r0 = this;
            super.onAutofillEvent(r1, r2, r3)
            r0 = 1
            if (r3 == r0) goto L15
            r0 = 2
            if (r3 == r0) goto L12
            r0 = 3
            if (r3 == r0) goto Lf
            java.lang.String r0 = "Unknown status event."
            goto L17
        Lf:
            java.lang.String r0 = "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account"
            goto L17
        L12:
            java.lang.String r0 = "Autofill popup was hidden."
            goto L17
        L15:
            java.lang.String r0 = "Autofill popup was shown."
        L17:
            java.lang.String r1 = "Autofill Status"
            android.util.Log.d(r1, r0)
            return
    }
}
