package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vv  reason: default package */
/* loaded from: classes.dex */
public final class vv extends android.graphics.drawable.Drawable {
    public final java.lang.String a;
    public final defpackage.w31 b;
    public int c;
    public float d;
    public boolean e;

    public vv(java.lang.String r1, defpackage.nb3 r2, defpackage.w31 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r2.getClass()
            return
    }

    public final boolean a() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r1) {
            r0 = this;
            boolean r0 = r0.a()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
            throw r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
            r0 = this;
            boolean r0 = r0.a()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            throw r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
            r0 = this;
            boolean r0 = r0.a()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            throw r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r0 = this;
            boolean r0 = r0.a()
            if (r0 != 0) goto L8
            r0 = -2
            return r0
        L8:
            r0 = 0
            throw r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r1) {
            r0 = this;
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AsyncDrawable{destination='"
            r0.<init>(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = "', imageSize=null, result="
            r0.append(r1)
            r1 = 0
            r0.append(r1)
            java.lang.String r1 = ", canvasWidth="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", textSize="
            r0.append(r1)
            float r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", waitingForDimensions="
            r0.append(r1)
            boolean r2 = r2.e
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.String r2 = defpackage.xg6.r(r0, r2, r1)
            return r2
    }
}
