package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b96  reason: default package */
/* loaded from: classes.dex */
public final class b96 implements android.os.Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ b96(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r22) {
            r21 = this;
            r0 = r21
            r1 = r22
            int r0 = r0.a
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto L1fc;
                case 1: goto L1d3;
                case 2: goto L177;
                case 3: goto L171;
                case 4: goto L16b;
                case 5: goto L132;
                case 6: goto Lac;
                case 7: goto L7e;
                case 8: goto L4c;
                default: goto Le;
            }
        Le:
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r1)
            r7 = r6
            r6 = r4
        L14:
            int r8 = r1.dataPosition()
            if (r8 >= r0) goto L43
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r1)
            int r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r8)
            if (r9 == r5) goto L3e
            if (r9 == r3) goto L35
            if (r9 == r2) goto L2c
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r1, r8)
            goto L14
        L2c:
            android.os.Parcelable$Creator<com.google.android.gms.common.internal.zav> r6 = com.google.android.gms.common.internal.zav.CREATOR
            android.os.Parcelable r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r1, r8, r6)
            com.google.android.gms.common.internal.zav r6 = (com.google.android.gms.common.internal.zav) r6
            goto L14
        L35:
            android.os.Parcelable$Creator<com.google.android.gms.common.ConnectionResult> r4 = com.google.android.gms.common.ConnectionResult.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r1, r8, r4)
            com.google.android.gms.common.ConnectionResult r4 = (com.google.android.gms.common.ConnectionResult) r4
            goto L14
        L3e:
            int r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r1, r8)
            goto L14
        L43:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r1, r0)
            xz7 r0 = new xz7
            r0.<init>(r7, r4, r6)
            return r0
        L4c:
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r1)
        L50:
            int r2 = r1.dataPosition()
            if (r2 >= r0) goto L75
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r1)
            int r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            if (r7 == r5) goto L70
            if (r7 == r3) goto L66
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r1, r2)
            goto L50
        L66:
            android.os.Parcelable$Creator<com.google.android.gms.common.internal.zat> r4 = com.google.android.gms.common.internal.zat.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r1, r2, r4)
            r4 = r2
            com.google.android.gms.common.internal.zat r4 = (com.google.android.gms.common.internal.zat) r4
            goto L50
        L70:
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r1, r2)
            goto L50
        L75:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r1, r0)
            uz7 r0 = new uz7
            r0.<init>(r6, r4)
            return r0
        L7e:
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r1)
            r2 = r4
        L83:
            int r6 = r1.dataPosition()
            if (r6 >= r0) goto La3
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r1)
            int r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r6)
            if (r7 == r5) goto L9e
            if (r7 == r3) goto L99
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r1, r6)
            goto L83
        L99:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r1, r6)
            goto L83
        L9e:
            java.util.ArrayList r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r1, r6)
            goto L83
        La3:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r1, r0)
            sz7 r0 = new sz7
            r0.<init>(r4, r2)
            return r0
        Lac:
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r1)
            r2 = 0
            r15 = r2
            r9 = r4
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r17 = r14
            r18 = r17
            r19 = r18
            r20 = r19
            r8 = r6
        Lc2:
            int r2 = r1.dataPosition()
            if (r2 >= r0) goto L129
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r1)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L123;
                case 2: goto L11d;
                case 3: goto L117;
                case 4: goto L111;
                case 5: goto L10b;
                case 6: goto L101;
                case 7: goto Lfb;
                case 8: goto Lf5;
                case 9: goto Lee;
                case 10: goto Le5;
                case 11: goto Lde;
                case 12: goto Ld7;
                default: goto Ld3;
            }
        Ld3:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r1, r2)
            goto Lc2
        Ld7:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r1, r2)
            r20 = r2
            goto Lc2
        Lde:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r1, r2)
            r19 = r2
            goto Lc2
        Le5:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.util.ArrayList r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r1, r2, r3)
            r18 = r2
            goto Lc2
        Lee:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r1, r2)
            r17 = r2
            goto Lc2
        Lf5:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r1, r2)
            r15 = r2
            goto Lc2
        Lfb:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r1, r2)
            r14 = r2
            goto Lc2
        L101:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r1, r2, r3)
            android.net.Uri r2 = (android.net.Uri) r2
            r13 = r2
            goto Lc2
        L10b:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r1, r2)
            r12 = r2
            goto Lc2
        L111:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r1, r2)
            r11 = r2
            goto Lc2
        L117:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r1, r2)
            r10 = r2
            goto Lc2
        L11d:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r1, r2)
            r9 = r2
            goto Lc2
        L123:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r1, r2)
            r8 = r2
            goto Lc2
        L129:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r1, r0)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r7 = new com.google.android.gms.auth.api.signin.GoogleSignInAccount
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20)
            return r7
        L132:
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r1)
            r7 = r6
        L137:
            int r8 = r1.dataPosition()
            if (r8 >= r0) goto L162
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r1)
            int r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r8)
            if (r9 == r5) goto L15d
            if (r9 == r3) goto L158
            if (r9 == r2) goto L14f
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r1, r8)
            goto L137
        L14f:
            android.os.Parcelable$Creator r4 = android.content.Intent.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r1, r8, r4)
            android.content.Intent r4 = (android.content.Intent) r4
            goto L137
        L158:
            int r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r1, r8)
            goto L137
        L15d:
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r1, r8)
            goto L137
        L162:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r1, r0)
            fz7 r0 = new fz7
            r0.<init>(r6, r7, r4)
            return r0
        L16b:
            vc7 r0 = new vc7
            r0.<init>(r1)
            return r0
        L171:
            vw6 r0 = new vw6
            r0.<init>(r1)
            return r0
        L177:
            yo6 r0 = new yo6
            r0.<init>()
            int r2 = r1.readInt()
            r0.A = r2
            int r2 = r1.readInt()
            r0.B = r2
            int r2 = r1.readInt()
            r0.L = r2
            if (r2 <= 0) goto L197
            int[] r2 = new int[r2]
            r0.R = r2
            r1.readIntArray(r2)
        L197:
            int r2 = r1.readInt()
            r0.X = r2
            if (r2 <= 0) goto L1a6
            int[] r2 = new int[r2]
            r0.Y = r2
            r1.readIntArray(r2)
        L1a6:
            int r2 = r1.readInt()
            if (r2 != r5) goto L1ae
            r2 = r5
            goto L1af
        L1ae:
            r2 = r6
        L1af:
            r0.d0 = r2
            int r2 = r1.readInt()
            if (r2 != r5) goto L1b9
            r2 = r5
            goto L1ba
        L1b9:
            r2 = r6
        L1ba:
            r0.e0 = r2
            int r2 = r1.readInt()
            if (r2 != r5) goto L1c3
            goto L1c4
        L1c3:
            r5 = r6
        L1c4:
            r0.f0 = r5
            java.lang.Class<xo6> r2 = defpackage.xo6.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            java.util.ArrayList r1 = r1.readArrayList(r2)
            r0.Z = r1
            return r0
        L1d3:
            xo6 r0 = new xo6
            r0.<init>()
            int r2 = r1.readInt()
            r0.A = r2
            int r2 = r1.readInt()
            r0.B = r2
            int r2 = r1.readInt()
            if (r2 != r5) goto L1eb
            goto L1ec
        L1eb:
            r5 = r6
        L1ec:
            r0.R = r5
            int r2 = r1.readInt()
            if (r2 <= 0) goto L1fb
            int[] r2 = new int[r2]
            r0.L = r2
            r1.readIntArray(r2)
        L1fb:
            return r0
        L1fc:
            c96 r0 = new c96
            r0.<init>(r1)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int r1) {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L20;
                case 1: goto L1d;
                case 2: goto L1a;
                case 3: goto L17;
                case 4: goto L14;
                case 5: goto L11;
                case 6: goto Le;
                case 7: goto Lb;
                case 8: goto L8;
                default: goto L5;
            }
        L5:
            xz7[] r0 = new defpackage.xz7[r1]
            return r0
        L8:
            uz7[] r0 = new defpackage.uz7[r1]
            return r0
        Lb:
            sz7[] r0 = new defpackage.sz7[r1]
            return r0
        Le:
            com.google.android.gms.auth.api.signin.GoogleSignInAccount[] r0 = new com.google.android.gms.auth.api.signin.GoogleSignInAccount[r1]
            return r0
        L11:
            fz7[] r0 = new defpackage.fz7[r1]
            return r0
        L14:
            vc7[] r0 = new defpackage.vc7[r1]
            return r0
        L17:
            vw6[] r0 = new defpackage.vw6[r1]
            return r0
        L1a:
            yo6[] r0 = new defpackage.yo6[r1]
            return r0
        L1d:
            xo6[] r0 = new defpackage.xo6[r1]
            return r0
        L20:
            c96[] r0 = new defpackage.c96[r1]
            return r0
    }
}
