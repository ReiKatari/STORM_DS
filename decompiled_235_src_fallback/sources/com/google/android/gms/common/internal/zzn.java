package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzn implements android.os.Parcelable.Creator {
    public zzn() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void zza(com.google.android.gms.common.internal.GetServiceRequest r4, android.os.Parcel r5, int r6) {
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r1 = 1
            int r2 = r4.zzc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r2)
            r1 = 2
            int r2 = r4.zzd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r2)
            r1 = 3
            int r2 = r4.zze
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r2)
            java.lang.String r1 = r4.zzf
            r2 = 4
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            r1 = 5
            android.os.IBinder r2 = r4.zzg
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r5, r1, r2, r3)
            r1 = 6
            com.google.android.gms.common.api.Scope[] r2 = r4.zzh
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(r5, r1, r2, r6, r3)
            r1 = 7
            android.os.Bundle r2 = r4.zzi
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(r5, r1, r2, r3)
            r1 = 8
            android.accounts.Account r2 = r4.zzj
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r1, r2, r6, r3)
            r1 = 10
            com.google.android.gms.common.Feature[] r2 = r4.zzk
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(r5, r1, r2, r6, r3)
            r1 = 11
            com.google.android.gms.common.Feature[] r2 = r4.zzl
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(r5, r1, r2, r6, r3)
            r6 = 12
            boolean r1 = r4.zzm
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r6, r1)
            r6 = 13
            int r1 = r4.zzn
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r6, r1)
            r6 = 14
            boolean r1 = r4.zzo
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r6, r1)
            r6 = 15
            java.lang.String r4 = r4.zza()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r6, r4, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r23) {
            r22 = this;
            r0 = r23
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r0)
            com.google.android.gms.common.api.Scope[] r2 = com.google.android.gms.common.internal.GetServiceRequest.zza
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            com.google.android.gms.common.Feature[] r4 = com.google.android.gms.common.internal.GetServiceRequest.zzb
            r5 = 0
            r6 = 0
            r13 = r2
            r14 = r3
            r16 = r4
            r17 = r16
            r11 = r5
            r12 = r11
            r15 = r12
            r21 = r15
            r8 = r6
            r9 = r8
            r10 = r9
            r18 = r10
            r19 = r18
            r20 = r19
        L25:
            int r2 = r0.dataPosition()
            if (r2 >= r1) goto L96
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r0)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L91;
                case 2: goto L8c;
                case 3: goto L87;
                case 4: goto L82;
                case 5: goto L7d;
                case 6: goto L73;
                case 7: goto L6e;
                case 8: goto L64;
                case 9: goto L36;
                case 10: goto L59;
                case 11: goto L4e;
                case 12: goto L49;
                case 13: goto L44;
                case 14: goto L3f;
                case 15: goto L3a;
                default: goto L36;
            }
        L36:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L25
        L3a:
            java.lang.String r21 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L25
        L3f:
            boolean r20 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L25
        L44:
            int r19 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L25
        L49:
            boolean r18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L25
        L4e:
            android.os.Parcelable$Creator<com.google.android.gms.common.Feature> r3 = com.google.android.gms.common.Feature.CREATOR
            java.lang.Object[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(r0, r2, r3)
            r17 = r2
            com.google.android.gms.common.Feature[] r17 = (com.google.android.gms.common.Feature[]) r17
            goto L25
        L59:
            android.os.Parcelable$Creator<com.google.android.gms.common.Feature> r3 = com.google.android.gms.common.Feature.CREATOR
            java.lang.Object[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(r0, r2, r3)
            r16 = r2
            com.google.android.gms.common.Feature[] r16 = (com.google.android.gms.common.Feature[]) r16
            goto L25
        L64:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r15 = r2
            android.accounts.Account r15 = (android.accounts.Account) r15
            goto L25
        L6e:
            android.os.Bundle r14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            goto L25
        L73:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.lang.Object[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(r0, r2, r3)
            r13 = r2
            com.google.android.gms.common.api.Scope[] r13 = (com.google.android.gms.common.api.Scope[]) r13
            goto L25
        L7d:
            android.os.IBinder r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(r0, r2)
            goto L25
        L82:
            java.lang.String r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L25
        L87:
            int r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L25
        L8c:
            int r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L25
        L91:
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L25
        L96:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.common.internal.GetServiceRequest r7 = new com.google.android.gms.common.internal.GetServiceRequest
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r7
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.internal.GetServiceRequest[] r0 = new com.google.android.gms.common.internal.GetServiceRequest[r1]
            return r0
    }
}
