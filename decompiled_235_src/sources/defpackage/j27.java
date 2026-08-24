package defpackage;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j27  reason: default package */
/* loaded from: classes.dex */
public final class j27 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ p27 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j27(p27 p27Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = p27Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                long j = ((jk4) obj).a;
                return new j27(this.Z, (r41) obj2, 0).s(jg7Var);
            case 1:
                return ((j27) q((r41) obj2, (w61) obj)).s(jg7Var);
            default:
                return ((j27) q((r41) obj2, (w61) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        p27 p27Var = this.Z;
        switch (i) {
            case 0:
                j27 j27Var = new j27(p27Var, r41Var, 0);
                long j = ((jk4) obj).a;
                return j27Var;
            case 1:
                return new j27(p27Var, r41Var, 1);
            default:
                return new j27(p27Var, r41Var, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x02ce, code lost:
        if (r0 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x040e, code lost:
        if (r5.s(r45) == r1) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:?, code lost:
        return r1;
     */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, pc1] */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        jg7 jg7Var;
        int i;
        fp fpVar;
        tr0 tr0Var;
        sr0 sr0Var;
        Object obj2;
        CharSequence text;
        CharSequence charSequence;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.X;
        p27 p27Var = this.Z;
        jg7 jg7Var2 = jg7.a;
        switch (i7) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i8 = this.Y;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            oi2.Y(obj);
                            return jg7Var2;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    break;
                }
                vr4 a = p27.a(p27Var);
                if (a != null) {
                    String str = (String) a.A;
                    long j = ((k47) a.B).a;
                    zx4 zx4Var = p27Var.j;
                    if (zx4Var != null) {
                        this.Y = 2;
                        if (str.length() == 0 || k47.c(j)) {
                            jg7Var = jg7Var2;
                        } else {
                            jg7Var = hv.d0(zx4Var.a, new l5(zx4Var, new c0(j, null, zx4Var, str), (r41) null, 24), this);
                        }
                        if (jg7Var != x61Var) {
                            jg7Var = jg7Var2;
                        }
                        if (jg7Var != x61Var) {
                            return jg7Var2;
                        }
                        return x61Var;
                    }
                    return jg7Var2;
                }
                return jg7Var2;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i9 = this.Y;
                if (i9 != 0) {
                    if (i9 == 1) {
                        oi2.Y(obj);
                        return jg7Var2;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                if (!k47.c(p27Var.n().b) && p27Var.j() && !(p27Var.f instanceof jt4)) {
                    fpVar = ln2.A(p27Var.n());
                    fp D = ln2.D(p27Var.n(), p27Var.n().a.B.length());
                    fp C = ln2.C(p27Var.n(), p27Var.n().a.B.length());
                    dp dpVar = new dp(D);
                    dpVar.a(C);
                    fp f = dpVar.f();
                    int f2 = k47.f(p27Var.n().b);
                    p27Var.c.g(p27.e(f, jx2.f(f2, f2)));
                    p27Var.q(hv2.None);
                    i = 1;
                    p27Var.a.e = true;
                } else {
                    i = 1;
                    fpVar = null;
                }
                if (fpVar != null && (tr0Var = p27Var.h) != null) {
                    sr0 I = lb4.I(fpVar);
                    this.Y = i;
                    ((ce) tr0Var).a(I);
                    if (jg7Var2 == x61Var2) {
                        return x61Var2;
                    }
                    return jg7Var2;
                }
                return jg7Var2;
            default:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            oi2.Y(obj);
                            obj2 = obj;
                            fp fpVar2 = (fp) obj2;
                            if (fpVar2 != null && p27Var.j()) {
                                dp dpVar2 = new dp(ln2.D(p27Var.n(), p27Var.n().a.B.length()));
                                dpVar2.a(fpVar2);
                                fp f3 = dpVar2.f();
                                fp C2 = ln2.C(p27Var.n(), p27Var.n().a.B.length());
                                dp dpVar3 = new dp(f3);
                                dpVar3.a(C2);
                                fp f4 = dpVar3.f();
                                int length = fpVar2.B.length() + k47.f(p27Var.n().b);
                                p27Var.c.g(p27.e(f4, jx2.f(length, length)));
                                p27Var.q(hv2.None);
                                p27Var.a.e = true;
                                return jg7Var2;
                            }
                            return jg7Var2;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    sr0Var = obj;
                } else {
                    oi2.Y(obj);
                    tr0 tr0Var2 = p27Var.h;
                    if (tr0Var2 != null) {
                        this.Y = 1;
                        ClipData primaryClip = ((ce) tr0Var2).a.a().getPrimaryClip();
                        if (primaryClip != null) {
                            sr0Var = new sr0(primaryClip);
                            break;
                        } else {
                            sr0Var = null;
                            break;
                        }
                    } else {
                        return jg7Var2;
                    }
                }
                sr0 sr0Var2 = sr0Var;
                if (sr0Var2 != null) {
                    this.Y = 2;
                    int i11 = 0;
                    ClipData.Item itemAt = sr0Var2.a.getItemAt(0);
                    if (itemAt != null && (text = itemAt.getText()) != null) {
                        if (!(text instanceof Spanned)) {
                            obj2 = new fp(text.toString());
                            break;
                        } else {
                            Spanned spanned = (Spanned) text;
                            Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                            ArrayList arrayList2 = new ArrayList();
                            annotationArr.getClass();
                            int length2 = annotationArr.length - 1;
                            if (length2 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    Annotation annotation = annotationArr[i12];
                                    if (!nb3.k(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                        charSequence = text;
                                        i2 = i11;
                                    } else {
                                        int spanStart = spanned.getSpanStart(annotation);
                                        int spanEnd = spanned.getSpanEnd(annotation);
                                        String value = annotation.getValue();
                                        ?? obj3 = new Object();
                                        Parcel obtain = Parcel.obtain();
                                        obj3.a = obtain;
                                        byte[] decode = Base64.decode(value, i11);
                                        obtain.unmarshall(decode, i11, decode.length);
                                        obtain.setDataPosition(i11);
                                        Parcel parcel = obj3.a;
                                        long j2 = kt0.h;
                                        long j3 = j2;
                                        long j4 = x47.c;
                                        long j5 = j4;
                                        oj2 oj2Var = null;
                                        ij2 ij2Var = null;
                                        jj2 jj2Var = null;
                                        String str2 = null;
                                        x20 x20Var = null;
                                        f37 f37Var = null;
                                        b17 b17Var = null;
                                        ge6 ge6Var = null;
                                        while (true) {
                                            if (parcel.dataAvail() > 1) {
                                                byte readByte = parcel.readByte();
                                                i2 = i11;
                                                if (readByte == 1) {
                                                    if (parcel.dataAvail() >= 8) {
                                                        j2 = obj3.a();
                                                        i11 = i2;
                                                    }
                                                } else if (readByte == 2) {
                                                    if (parcel.dataAvail() >= 5) {
                                                        j4 = obj3.b();
                                                        i11 = i2;
                                                    }
                                                } else if (readByte == 3) {
                                                    if (parcel.dataAvail() >= 4) {
                                                        oj2Var = new oj2(parcel.readInt());
                                                        i11 = i2;
                                                    }
                                                } else if (readByte == 4) {
                                                    if (parcel.dataAvail() >= 1) {
                                                        byte readByte2 = parcel.readByte();
                                                        if (readByte2 == 0 || readByte2 != 1) {
                                                            i6 = i2;
                                                        } else {
                                                            i6 = 1;
                                                        }
                                                        ij2 ij2Var2 = new ij2(i6);
                                                        i11 = i2;
                                                        ij2Var = ij2Var2;
                                                    }
                                                } else if (readByte == 5) {
                                                    if (parcel.dataAvail() >= 1) {
                                                        byte readByte3 = parcel.readByte();
                                                        if (readByte3 != 0) {
                                                            if (readByte3 == 1) {
                                                                i5 = 65535;
                                                            } else if (readByte3 == 3) {
                                                                i5 = 2;
                                                            } else if (readByte3 == 2) {
                                                                i5 = 1;
                                                            }
                                                            jj2 jj2Var2 = new jj2(i5);
                                                            i11 = i2;
                                                            jj2Var = jj2Var2;
                                                        }
                                                        i5 = i2;
                                                        jj2 jj2Var22 = new jj2(i5);
                                                        i11 = i2;
                                                        jj2Var = jj2Var22;
                                                    }
                                                } else {
                                                    if (readByte == 6) {
                                                        str2 = parcel.readString();
                                                    } else if (readByte == 7) {
                                                        if (parcel.dataAvail() >= 5) {
                                                            j5 = obj3.b();
                                                        }
                                                    } else if (readByte == 8) {
                                                        if (parcel.dataAvail() >= 4) {
                                                            i11 = i2;
                                                            x20Var = new x20(parcel.readFloat());
                                                        }
                                                    } else if (readByte == 9) {
                                                        if (parcel.dataAvail() >= 8) {
                                                            f37Var = new f37(parcel.readFloat(), parcel.readFloat());
                                                        }
                                                    } else if (readByte == 10) {
                                                        if (parcel.dataAvail() >= 8) {
                                                            j3 = obj3.a();
                                                        }
                                                    } else {
                                                        if (readByte == 11) {
                                                            if (parcel.dataAvail() >= 4) {
                                                                int readInt = parcel.readInt();
                                                                if ((readInt & 2) != 0) {
                                                                    i3 = 1;
                                                                } else {
                                                                    i3 = i2;
                                                                }
                                                                if ((readInt & 1) != 0) {
                                                                    i4 = 1;
                                                                } else {
                                                                    i4 = i2;
                                                                }
                                                                b17 b17Var2 = b17.d;
                                                                charSequence = text;
                                                                b17 b17Var3 = b17.c;
                                                                if (i3 != 0 && i4 != 0) {
                                                                    List c0 = hf.c0(b17Var2, b17Var3);
                                                                    Integer valueOf = Integer.valueOf(i2);
                                                                    int size = c0.size();
                                                                    int i13 = i2;
                                                                    while (i13 < size) {
                                                                        valueOf = Integer.valueOf(((b17) c0.get(i13)).a | valueOf.intValue());
                                                                        i13++;
                                                                        c0 = c0;
                                                                    }
                                                                    b17Var = new b17(valueOf.intValue());
                                                                } else if (i3 != 0) {
                                                                    b17Var = b17Var2;
                                                                } else {
                                                                    if (i4 == 0) {
                                                                        b17Var3 = b17.b;
                                                                    }
                                                                    b17Var = b17Var3;
                                                                }
                                                            }
                                                        } else {
                                                            charSequence = text;
                                                            if (readByte == 12) {
                                                                if (parcel.dataAvail() >= 20) {
                                                                    long a2 = obj3.a();
                                                                    float readFloat = parcel.readFloat();
                                                                    float readFloat2 = parcel.readFloat();
                                                                    Parcel parcel2 = parcel;
                                                                    long floatToRawIntBits = Float.floatToRawIntBits(readFloat);
                                                                    i11 = i2;
                                                                    text = charSequence;
                                                                    parcel = parcel2;
                                                                    ge6Var = new ge6(parcel2.readFloat(), a2, (floatToRawIntBits << 32) | (Float.floatToRawIntBits(readFloat2) & 4294967295L));
                                                                }
                                                            }
                                                        }
                                                        i11 = i2;
                                                        text = charSequence;
                                                    }
                                                    i11 = i2;
                                                }
                                            } else {
                                                charSequence = text;
                                                i2 = i11;
                                            }
                                        }
                                        charSequence = text;
                                        arrayList2.add(new ep(new nn6(j2, j4, oj2Var, ij2Var, jj2Var, (li2) null, str2, j5, x20Var, f37Var, (gy3) null, j3, b17Var, ge6Var, 49152), spanStart, spanEnd));
                                    }
                                    if (i12 != length2) {
                                        i12++;
                                        i11 = i2;
                                        text = charSequence;
                                    }
                                }
                            } else {
                                charSequence = text;
                            }
                            String obj4 = charSequence.toString();
                            fp fpVar3 = gp.a;
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            obj2 = new fp(arrayList, obj4);
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                } else {
                    return jg7Var2;
                }
                break;
        }
    }
}
