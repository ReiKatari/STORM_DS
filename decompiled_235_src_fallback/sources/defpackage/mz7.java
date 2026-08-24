package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mz7  reason: default package */
/* loaded from: classes.dex */
public abstract class mz7 extends defpackage.hz7 {
    @Override // defpackage.hz7
    public final boolean zaa(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
            r0 = this;
            switch(r1) {
                case 3: goto L4c;
                case 4: goto L40;
                case 5: goto L3;
                case 6: goto L34;
                case 7: goto L20;
                case 8: goto L11;
                case 9: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            android.os.Parcelable$Creator<sz7> r0 = defpackage.sz7.CREATOR
            android.os.Parcelable r0 = defpackage.kz7.a(r2, r0)
            sz7 r0 = (defpackage.sz7) r0
            defpackage.kz7.b(r2)
            goto L5f
        L11:
            android.os.Parcelable$Creator<xz7> r1 = defpackage.xz7.CREATOR
            android.os.Parcelable r1 = defpackage.kz7.a(r2, r1)
            xz7 r1 = (defpackage.xz7) r1
            defpackage.kz7.b(r2)
            r0.zab(r1)
            goto L5f
        L20:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r0 = defpackage.kz7.a(r2, r0)
            com.google.android.gms.common.api.Status r0 = (com.google.android.gms.common.api.Status) r0
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r0 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
            android.os.Parcelable r0 = defpackage.kz7.a(r2, r0)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r0
            defpackage.kz7.b(r2)
            goto L5f
        L34:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r0 = defpackage.kz7.a(r2, r0)
            com.google.android.gms.common.api.Status r0 = (com.google.android.gms.common.api.Status) r0
            defpackage.kz7.b(r2)
            goto L5f
        L40:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r0 = defpackage.kz7.a(r2, r0)
            com.google.android.gms.common.api.Status r0 = (com.google.android.gms.common.api.Status) r0
            defpackage.kz7.b(r2)
            goto L5f
        L4c:
            android.os.Parcelable$Creator<com.google.android.gms.common.ConnectionResult> r0 = com.google.android.gms.common.ConnectionResult.CREATOR
            android.os.Parcelable r0 = defpackage.kz7.a(r2, r0)
            com.google.android.gms.common.ConnectionResult r0 = (com.google.android.gms.common.ConnectionResult) r0
            android.os.Parcelable$Creator<fz7> r0 = defpackage.fz7.CREATOR
            android.os.Parcelable r0 = defpackage.kz7.a(r2, r0)
            fz7 r0 = (defpackage.fz7) r0
            defpackage.kz7.b(r2)
        L5f:
            r3.writeNoException()
            r0 = 1
            return r0
    }

    public abstract void zab(defpackage.xz7 r1);
}
