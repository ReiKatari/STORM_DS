package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public interface IGmsServiceBroker extends android.os.IInterface {

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static abstract class Stub extends android.os.Binder implements com.google.android.gms.common.internal.IGmsServiceBroker {
        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.google.android.gms.common.internal.IGmsServiceBroker"
                r1.attachInterface(r1, r0)
                return
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public final boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
                r3 = this;
                r0 = 16777215(0xffffff, float:2.3509886E-38)
                if (r4 <= r0) goto La
                boolean r3 = super.onTransact(r4, r5, r6, r7)
                return r3
            La:
                java.lang.String r7 = "com.google.android.gms.common.internal.IGmsServiceBroker"
                r5.enforceInterface(r7)
                android.os.IBinder r7 = r5.readStrongBinder()
                r0 = 0
                if (r7 != 0) goto L18
                r1 = r0
                goto L2a
            L18:
                java.lang.String r1 = "com.google.android.gms.common.internal.IGmsCallbacks"
                android.os.IInterface r1 = r7.queryLocalInterface(r1)
                boolean r2 = r1 instanceof com.google.android.gms.common.internal.IGmsCallbacks
                if (r2 == 0) goto L25
                com.google.android.gms.common.internal.IGmsCallbacks r1 = (com.google.android.gms.common.internal.IGmsCallbacks) r1
                goto L2a
            L25:
                com.google.android.gms.common.internal.zzab r1 = new com.google.android.gms.common.internal.zzab
                r1.<init>(r7)
            L2a:
                r7 = 46
                r2 = 1
                if (r4 != r7) goto L48
                int r4 = r5.readInt()
                if (r4 == 0) goto L3e
                android.os.Parcelable$Creator<com.google.android.gms.common.internal.GetServiceRequest> r4 = com.google.android.gms.common.internal.GetServiceRequest.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.google.android.gms.common.internal.GetServiceRequest r0 = (com.google.android.gms.common.internal.GetServiceRequest) r0
            L3e:
                r3.getService(r1, r0)
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
                r6.writeNoException()
                return r2
            L48:
                r3 = 47
                r6 = 0
                if (r4 != r3) goto L5f
                int r3 = r5.readInt()
                if (r3 == 0) goto L5b
                android.os.Parcelable$Creator<com.google.android.gms.common.internal.zzak> r3 = com.google.android.gms.common.internal.zzak.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r5)
                com.google.android.gms.common.internal.zzak r3 = (com.google.android.gms.common.internal.zzak) r3
            L5b:
                defpackage.e41.t()
                return r6
            L5f:
                r5.readInt()
                r3 = 4
                if (r4 == r3) goto L10c
                r5.readString()
                if (r4 == r2) goto Lf5
                r3 = 2
                if (r4 == r3) goto Le6
                r3 = 23
                if (r4 == r3) goto Le6
                r3 = 25
                if (r4 == r3) goto Le6
                r3 = 27
                if (r4 == r3) goto Le6
                r3 = 30
                if (r4 == r3) goto Ld1
                r3 = 34
                if (r4 == r3) goto Lcd
                r3 = 41
                if (r4 == r3) goto Le6
                r3 = 43
                if (r4 == r3) goto Le6
                r3 = 37
                if (r4 == r3) goto Le6
                r3 = 38
                if (r4 == r3) goto Le6
                switch(r4) {
                    case 5: goto Le6;
                    case 6: goto Le6;
                    case 7: goto Le6;
                    case 8: goto Le6;
                    case 9: goto Laf;
                    case 10: goto La8;
                    case 11: goto Le6;
                    case 12: goto Le6;
                    case 13: goto Le6;
                    case 14: goto Le6;
                    case 15: goto Le6;
                    case 16: goto Le6;
                    case 17: goto Le6;
                    case 18: goto Le6;
                    case 19: goto L96;
                    case 20: goto Ld1;
                    default: goto L94;
                }
            L94:
                goto L10c
            L96:
                r5.readStrongBinder()
                int r3 = r5.readInt()
                if (r3 == 0) goto L10c
                android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r5)
                android.os.Bundle r3 = (android.os.Bundle) r3
                goto L10c
            La8:
                r5.readString()
                r5.createStringArray()
                goto L10c
            Laf:
                r5.readString()
                r5.createStringArray()
                r5.readString()
                r5.readStrongBinder()
                r5.readString()
                int r3 = r5.readInt()
                if (r3 == 0) goto L10c
                android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r5)
                android.os.Bundle r3 = (android.os.Bundle) r3
                goto L10c
            Lcd:
                r5.readString()
                goto L10c
            Ld1:
                r5.createStringArray()
                r5.readString()
                int r3 = r5.readInt()
                if (r3 == 0) goto L10c
                android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r5)
                android.os.Bundle r3 = (android.os.Bundle) r3
                goto L10c
            Le6:
                int r3 = r5.readInt()
                if (r3 == 0) goto L10c
                android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r5)
                android.os.Bundle r3 = (android.os.Bundle) r3
                goto L10c
            Lf5:
                r5.readString()
                r5.createStringArray()
                r5.readString()
                int r3 = r5.readInt()
                if (r3 == 0) goto L10c
                android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r5)
                android.os.Bundle r3 = (android.os.Bundle) r3
            L10c:
                defpackage.e41.t()
                return r6
        }
    }

    void getService(com.google.android.gms.common.internal.IGmsCallbacks r1, com.google.android.gms.common.internal.GetServiceRequest r2);
}
