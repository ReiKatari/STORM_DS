package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b96  reason: default package */
/* loaded from: classes.dex */
public final class b96 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, xo6] */
    /* JADX WARN: Type inference failed for: r0v4, types: [yo6, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        Intent intent = null;
        ConnectionResult connectionResult = null;
        zat zatVar = null;
        ArrayList<String> arrayList = null;
        boolean z3 = true;
        int i = 0;
        switch (this.a) {
            case 0:
                return new c96(parcel);
            case 1:
                ?? obj = new Object();
                obj.A = parcel.readInt();
                obj.B = parcel.readInt();
                if (parcel.readInt() != 1) {
                    z3 = false;
                }
                obj.R = z3;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    obj.L = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj;
            case 2:
                ?? obj2 = new Object();
                obj2.A = parcel.readInt();
                obj2.B = parcel.readInt();
                int readInt2 = parcel.readInt();
                obj2.L = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    obj2.R = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                obj2.X = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    obj2.Y = iArr3;
                    parcel.readIntArray(iArr3);
                }
                if (parcel.readInt() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                obj2.d0 = z;
                if (parcel.readInt() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                obj2.e0 = z2;
                if (parcel.readInt() != 1) {
                    z3 = false;
                }
                obj2.f0 = z3;
                obj2.Z = parcel.readArrayList(xo6.class.getClassLoader());
                return obj2;
            case 3:
                return new vw6(parcel);
            case 4:
                return new vc7(parcel);
            case 5:
                int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
                int i2 = 0;
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readHeader = SafeParcelReader.readHeader(parcel);
                    int fieldId = SafeParcelReader.getFieldId(readHeader);
                    if (fieldId != 1) {
                        if (fieldId != 2) {
                            if (fieldId != 3) {
                                SafeParcelReader.skipUnknownField(parcel, readHeader);
                            } else {
                                intent = (Intent) SafeParcelReader.createParcelable(parcel, readHeader, Intent.CREATOR);
                            }
                        } else {
                            i2 = SafeParcelReader.readInt(parcel, readHeader);
                        }
                    } else {
                        i = SafeParcelReader.readInt(parcel, readHeader);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
                return new fz7(i, i2, intent);
            case 6:
                int validateObjectHeader2 = SafeParcelReader.validateObjectHeader(parcel);
                long j = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Uri uri = null;
                String str5 = null;
                String str6 = null;
                ArrayList arrayList2 = null;
                String str7 = null;
                String str8 = null;
                int i3 = 0;
                while (parcel.dataPosition() < validateObjectHeader2) {
                    int readHeader2 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(readHeader2)) {
                        case 1:
                            i3 = SafeParcelReader.readInt(parcel, readHeader2);
                            break;
                        case 2:
                            str = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case 3:
                            str2 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case 4:
                            str3 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case 5:
                            str4 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case 6:
                            uri = (Uri) SafeParcelReader.createParcelable(parcel, readHeader2, Uri.CREATOR);
                            break;
                        case 7:
                            str5 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case 8:
                            j = SafeParcelReader.readLong(parcel, readHeader2);
                            break;
                        case 9:
                            str6 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case 10:
                            arrayList2 = SafeParcelReader.createTypedList(parcel, readHeader2, Scope.CREATOR);
                            break;
                        case 11:
                            str7 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case 12:
                            str8 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, readHeader2);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader2);
                return new GoogleSignInAccount(i3, str, str2, str3, str4, uri, str5, j, str6, arrayList2, str7, str8);
            case 7:
                int validateObjectHeader3 = SafeParcelReader.validateObjectHeader(parcel);
                String str9 = null;
                while (parcel.dataPosition() < validateObjectHeader3) {
                    int readHeader3 = SafeParcelReader.readHeader(parcel);
                    int fieldId2 = SafeParcelReader.getFieldId(readHeader3);
                    if (fieldId2 != 1) {
                        if (fieldId2 != 2) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader3);
                        } else {
                            str9 = SafeParcelReader.createString(parcel, readHeader3);
                        }
                    } else {
                        arrayList = SafeParcelReader.createStringList(parcel, readHeader3);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader3);
                return new sz7(arrayList, str9);
            case 8:
                int validateObjectHeader4 = SafeParcelReader.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader4) {
                    int readHeader4 = SafeParcelReader.readHeader(parcel);
                    int fieldId3 = SafeParcelReader.getFieldId(readHeader4);
                    if (fieldId3 != 1) {
                        if (fieldId3 != 2) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader4);
                        } else {
                            zatVar = (zat) SafeParcelReader.createParcelable(parcel, readHeader4, zat.CREATOR);
                        }
                    } else {
                        i = SafeParcelReader.readInt(parcel, readHeader4);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader4);
                return new uz7(i, zatVar);
            default:
                int validateObjectHeader5 = SafeParcelReader.validateObjectHeader(parcel);
                int i4 = 0;
                zav zavVar = null;
                while (parcel.dataPosition() < validateObjectHeader5) {
                    int readHeader5 = SafeParcelReader.readHeader(parcel);
                    int fieldId4 = SafeParcelReader.getFieldId(readHeader5);
                    if (fieldId4 != 1) {
                        if (fieldId4 != 2) {
                            if (fieldId4 != 3) {
                                SafeParcelReader.skipUnknownField(parcel, readHeader5);
                            } else {
                                zavVar = (zav) SafeParcelReader.createParcelable(parcel, readHeader5, zav.CREATOR);
                            }
                        } else {
                            connectionResult = (ConnectionResult) SafeParcelReader.createParcelable(parcel, readHeader5, ConnectionResult.CREATOR);
                        }
                    } else {
                        i4 = SafeParcelReader.readInt(parcel, readHeader5);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader5);
                return new xz7(i4, connectionResult, zavVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new c96[i];
            case 1:
                return new xo6[i];
            case 2:
                return new yo6[i];
            case 3:
                return new vw6[i];
            case 4:
                return new vc7[i];
            case 5:
                return new fz7[i];
            case 6:
                return new GoogleSignInAccount[i];
            case 7:
                return new sz7[i];
            case 8:
                return new uz7[i];
            default:
                return new xz7[i];
        }
    }
}
