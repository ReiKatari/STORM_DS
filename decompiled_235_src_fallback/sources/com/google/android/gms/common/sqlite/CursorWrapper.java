package com.google.android.gms.common.sqlite;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class CursorWrapper extends android.database.CursorWrapper implements android.database.CrossProcessCursor {
    private android.database.AbstractWindowedCursor zza;

    public CursorWrapper(android.database.Cursor r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = 0
        L4:
            r1 = 10
            if (r0 >= r1) goto L15
            boolean r1 = r3 instanceof android.database.CursorWrapper
            if (r1 == 0) goto L15
            android.database.CursorWrapper r3 = (android.database.CursorWrapper) r3
            android.database.Cursor r3 = r3.getWrappedCursor()
            int r0 = r0 + 1
            goto L4
        L15:
            boolean r0 = r3 instanceof android.database.AbstractWindowedCursor
            if (r0 == 0) goto L1e
            android.database.AbstractWindowedCursor r3 = (android.database.AbstractWindowedCursor) r3
            r2.zza = r3
            return
        L1e:
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "Unknown type: "
            java.lang.String r2 = r3.concat(r2)
            defpackage.i.h(r2)
            r2 = 0
            throw r2
    }

    @Override // android.database.CrossProcessCursor
    public void fillWindow(int r1, android.database.CursorWindow r2) {
            r0 = this;
            android.database.AbstractWindowedCursor r0 = r0.zza
            r0.fillWindow(r1, r2)
            return
    }

    @Override // android.database.CrossProcessCursor
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public android.database.CursorWindow getWindow() {
            r0 = this;
            android.database.AbstractWindowedCursor r0 = r0.zza
            android.database.CursorWindow r0 = r0.getWindow()
            return r0
    }

    @Override // android.database.CursorWrapper
    public final /* synthetic */ android.database.Cursor getWrappedCursor() {
            r0 = this;
            android.database.AbstractWindowedCursor r0 = r0.zza
            return r0
    }

    @Override // android.database.CrossProcessCursor
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean onMove(int r1, int r2) {
            r0 = this;
            android.database.AbstractWindowedCursor r0 = r0.zza
            boolean r0 = r0.onMove(r1, r2)
            return r0
    }

    public void setWindow(android.database.CursorWindow r1) {
            r0 = this;
            android.database.AbstractWindowedCursor r0 = r0.zza
            r0.setWindow(r1)
            return
    }
}
