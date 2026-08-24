package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: au  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class au {
    public static /* bridge */ /* synthetic */ boolean A(android.view.autofill.AutofillValue r0) {
            boolean r0 = r0.isDate()
            return r0
    }

    public static /* bridge */ /* synthetic */ void B(android.view.autofill.AutofillManager r0, android.view.autofill.AutofillManager$AutofillCallback r1) {
            r0.registerCallback(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean C(android.view.autofill.AutofillValue r0) {
            boolean r0 = r0.isToggle()
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean D(android.view.autofill.AutofillValue r0) {
            boolean r0 = r0.isList()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.Bitmap.Config a(android.graphics.BitmapFactory.Options r0) {
            android.graphics.Bitmap$Config r0 = r0.outConfig
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.autofill.AutofillId b(java.lang.Object r0) {
            android.view.autofill.AutofillId r0 = (android.view.autofill.AutofillId) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.autofill.AutofillManager$AutofillCallback c(java.lang.Object r0) {
            android.view.autofill.AutofillManager$AutofillCallback r0 = (android.view.autofill.AutofillManager$AutofillCallback) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.autofill.AutofillValue d(java.lang.String r0) {
            android.view.autofill.AutofillValue r0 = android.view.autofill.AutofillValue.forText(r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.autofill.AutofillValue e(boolean r0) {
            android.view.autofill.AutofillValue r0 = android.view.autofill.AutofillValue.forToggle(r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Class f() {
            java.lang.Class<java.lang.invoke.MethodHandles$Lookup> r0 = java.lang.invoke.MethodHandles.Lookup.class
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Object g(java.lang.invoke.MethodHandle r0, java.lang.Object[] r1) {
            java.lang.Object r0 = r0.invokeWithArguments(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.String h(java.lang.Class r0) {
            java.lang.String r0 = r0.getTypeName()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.invoke.MethodHandle i(java.lang.invoke.MethodHandle r0, java.lang.Object r1) {
            java.lang.invoke.MethodHandle r0 = r0.bindTo(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.invoke.MethodHandle j(java.lang.invoke.MethodHandles.Lookup r1, java.lang.reflect.Method r2) {
            java.lang.Class<yr2> r0 = defpackage.yr2.class
            java.lang.invoke.MethodHandle r1 = r1.unreflectSpecial(r2, r0)
            return r1
    }

    public static /* bridge */ /* synthetic */ java.lang.invoke.MethodHandles.Lookup k(java.lang.Object r0) {
            java.lang.invoke.MethodHandles$Lookup r0 = (java.lang.invoke.MethodHandles.Lookup) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ void l(android.graphics.BitmapFactory.Options r0, android.graphics.ColorSpace r1) {
            r0.inPreferredColorSpace = r1
            return
    }

    public static /* bridge */ /* synthetic */ void m(android.graphics.Canvas r0, android.graphics.RectF r1) {
            r0.clipOutRect(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void n(android.hardware.camera2.CameraCaptureSession.StateCallback r0, android.hardware.camera2.CameraCaptureSession r1) {
            r0.onCaptureQueueEmpty(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void o(android.view.ViewStructure r1) {
            r0 = 129(0x81, float:1.81E-43)
            r1.setInputType(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void p(android.view.ViewStructure r0, int r1) {
            r0.setAutofillType(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void q(android.view.ViewStructure r0, android.view.autofill.AutofillId r1, int r2) {
            r0.setAutofillId(r1, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void r(android.view.ViewStructure r0, android.view.autofill.AutofillValue r1) {
            r0.setAutofillValue(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void s(android.view.ViewStructure r0, boolean r1) {
            r0.setDataIsSensitive(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void t(android.view.ViewStructure r0, java.lang.String[] r1) {
            r0.setAutofillHints(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void u(android.view.autofill.AutofillManager r0, android.view.autofill.AutofillManager$AutofillCallback r1) {
            r0.unregisterCallback(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean v(android.graphics.Canvas r0, float r1, float r2, float r3, float r4) {
            boolean r0 = r0.clipOutRect(r1, r2, r3, r4)
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean w(android.graphics.Canvas r0, int r1, int r2, int r3, int r4) {
            boolean r0 = r0.clipOutRect(r1, r2, r3, r4)
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean x(android.graphics.Canvas r0, android.graphics.Path r1) {
            boolean r0 = r0.clipOutPath(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean y(android.graphics.Canvas r0, android.graphics.Rect r1) {
            boolean r0 = r0.clipOutRect(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean z(android.graphics.Canvas r0, android.graphics.RectF r1) {
            boolean r0 = r0.clipOutRect(r1)
            return r0
    }
}
