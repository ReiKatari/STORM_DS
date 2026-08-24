package defpackage;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vd1  reason: default package */
/* loaded from: classes.dex */
public final class vd1 extends hw6 implements eo2 {
    public final /* synthetic */ int X = 1;
    public int Y;
    public final /* synthetic */ float Z;
    public Serializable d0;
    public Object e0;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd1(float f, r41 r41Var, kq2 kq2Var, qq2 qq2Var, String str, String str2) {
        super(2, r41Var);
        this.d0 = str;
        this.e0 = kq2Var;
        this.f0 = qq2Var;
        this.g0 = str2;
        this.Z = f;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((vd1) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((vd1) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((vd1) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.g0;
        Object obj3 = this.f0;
        switch (i) {
            case 0:
                return new vd1(this.Z, (wd1) obj3, (i86) obj2, r41Var);
            case 1:
                String str = (String) this.d0;
                return new vd1(this.Z, r41Var, (kq2) this.e0, (qq2) obj3, str, (String) obj2);
            default:
                return new vd1((ql6) this.e0, this.Z, (qn2) obj3, (p76) obj2, r41Var);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:96|97|(2:99|(4:101|(1:(1:104)(2:107|108))(1:109)|105|106)(2:110|111))(13:128|129|130|(1:132)(1:223)|133|134|135|(3:137|138|139)(2:176|(2:178|(1:191)(1:190))(3:192|193|194))|143|144|145|146|147)|112|113|(2:123|124)(3:117|118|119)) */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0565, code lost:
        if (r0 == r1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x05b2, code lost:
        if (defpackage.hv.d0(r0, r4, r5) == r1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x05b5, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0611, code lost:
        if (defpackage.hv.d0(r0, r22, r5) == r1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:?, code lost:
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ah5, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [ah5] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, ah5] */
    /* JADX WARN: Type inference failed for: r4v22, types: [nl6] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, ah5, java.io.Serializable] */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        float f;
        ah5 obj2;
        uo uoVar;
        ah5 ah5Var;
        Object obj3;
        kq2 kq2Var;
        x61 x61Var;
        String lowerCase;
        float f2;
        String str;
        qq2 qq2Var;
        oc7 oc7Var;
        Object N;
        oc7 oc7Var2;
        float f3;
        int i;
        long j;
        float signum;
        Object b;
        final ah5 ah5Var2;
        float f4;
        float f5;
        float f6;
        vd1 vd1Var = this;
        int i2 = vd1Var.X;
        float f7 = vd1Var.Z;
        int i3 = 0;
        Object obj4 = vd1Var.g0;
        Object obj5 = vd1Var.f0;
        switch (i2) {
            case 0:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i4 = vd1Var.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        uoVar = (uo) vd1Var.e0;
                        obj2 = (ah5) vd1Var.d0;
                        try {
                            oi2.Y(obj);
                            ah5Var = obj2;
                        } catch (CancellationException unused) {
                            obj2.A = ((Number) uoVar.a()).floatValue();
                            ah5Var = obj2;
                            f = ah5Var.A;
                            return new Float(f);
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (Math.abs(f7) > 1.0f) {
                        obj2 = new Object();
                        obj2.A = f7;
                        ?? obj6 = new Object();
                        uo f8 = ak7.f(RecyclerView.B1, f7, 28);
                        try {
                            wd1 wd1Var = (wd1) obj5;
                            oc1 oc1Var = wd1Var.a;
                            t00 t00Var = new t00((ah5) obj6, (i86) obj4, (ah5) obj2, wd1Var);
                            vd1Var.d0 = obj2;
                            vd1Var.e0 = f8;
                            vd1Var.Y = 1;
                            ah5Var = obj2;
                            if (kj2.m(f8, oc1Var, false, t00Var, vd1Var) == x61Var2) {
                                return x61Var2;
                            }
                        } catch (CancellationException unused2) {
                            uoVar = f8;
                            obj2.A = ((Number) uoVar.a()).floatValue();
                            ah5Var = obj2;
                            f = ah5Var.A;
                            return new Float(f);
                        }
                    } else {
                        f = f7;
                        return new Float(f);
                    }
                }
                f = ah5Var.A;
                return new Float(f);
            case 1:
                qq2 qq2Var2 = (qq2) obj5;
                String str2 = (String) obj4;
                String str3 = (String) vd1Var.d0;
                kq2 kq2Var2 = (kq2) vd1Var.e0;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i5 = vd1Var.Y;
                try {
                } catch (Throwable th) {
                    th = th;
                    obj3 = obj5;
                    kq2Var = kq2Var2;
                    x61Var = x61Var3;
                }
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                oi2.Y(obj);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj);
                        }
                        return jg7.a;
                    }
                    oi2.Y(obj);
                    qq2Var = qq2Var2;
                    f2 = f7;
                    obj3 = obj5;
                    kq2Var = kq2Var2;
                    str = "storm_neural_";
                    x61Var = x61Var3;
                    N = obj;
                } else {
                    oi2.Y(obj);
                    if (qs6.v0(str3)) {
                        lowerCase = "ru";
                    } else {
                        lowerCase = str3.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                    }
                    obj3 = obj5;
                    kq2Var = kq2Var2;
                    f2 = f7;
                    str = "storm_neural_";
                    qq2Var = qq2Var2;
                    String str4 = lowerCase;
                    try {
                        if (lowerCase.equals("ru")) {
                            switch (pq2.a[kq2Var.ordinal()]) {
                                case 1:
                                    oc7Var = new oc7("ru-RU-DmitryNeural", "-18%", "-8%");
                                    break;
                                case 2:
                                    oc7Var = new oc7("ru-RU-DmitryNeural", "-28%", "-14%");
                                    break;
                                case 3:
                                    oc7Var2 = new oc7("ru-RU-DmitryNeural", "+28%", "+26%");
                                    oc7Var = oc7Var2;
                                    break;
                                case 4:
                                    oc7Var = new oc7("ru-RU-DmitryNeural", "-38%", "-22%");
                                    break;
                                case 5:
                                    oc7Var = new oc7("ru-RU-DmitryNeural", "-12%", "-12%");
                                    break;
                                case 6:
                                    oc7Var = new oc7("ru-RU-SvetlanaNeural", "+25%", "+14%");
                                    break;
                                case 7:
                                    oc7Var = new oc7("ru-RU-SvetlanaNeural", "+32%", "+10%");
                                    break;
                                case 8:
                                    oc7Var = new oc7("ru-RU-SvetlanaNeural", "+4%", "-4%");
                                    break;
                                case 9:
                                    oc7Var = new oc7("ru-RU-DmitryNeural", "+12%", "+16%");
                                    break;
                                case 10:
                                    oc7Var = new oc7("ru-RU-DmitryNeural", "-8%", "+4%");
                                    break;
                                case 11:
                                    oc7Var = new oc7("ru-RU-DmitryNeural", "-16%", "+8%");
                                    break;
                                case 12:
                                    oc7Var = new oc7("ru-RU-SvetlanaNeural", "+18%", "+18%");
                                    break;
                                case 13:
                                    oc7Var = new oc7("ru-RU-SvetlanaNeural", "-5%", "-20%");
                                    break;
                                case 14:
                                    oc7Var = new oc7("ru-RU-SvetlanaNeural", "+45%", "+20%");
                                    break;
                                case 15:
                                    oc7Var = new oc7("ru-RU-DmitryNeural", "-6%", "+12%");
                                    break;
                                case 16:
                                    oc7Var = new oc7("ru-RU-DmitryNeural", "+32%", "+22%");
                                    break;
                                case 17:
                                    oc7Var = new oc7("ru-RU-DmitryNeural", "-4%", "-4%");
                                    break;
                                case 18:
                                    oc7Var = new oc7("ru-RU-SvetlanaNeural", "+12%", "-25%");
                                    break;
                                case 19:
                                    oc7Var = new oc7("ru-RU-DmitryNeural", "-10%", "-4%");
                                    break;
                                case 20:
                                    oc7Var2 = new oc7("ru-RU-DmitryNeural", "+38%", "+28%");
                                    oc7Var = oc7Var2;
                                    break;
                                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                    oc7Var = new oc7("ru-RU-SvetlanaNeural", "+16%", "-6%");
                                    break;
                                case 22:
                                    oc7Var = new oc7("ru-RU-SvetlanaNeural", "+2%", "0%");
                                    break;
                                case ConnectionResult.API_DISABLED /* 23 */:
                                    oc7Var = new oc7("ru-RU-DmitryNeural", "+6%", "+2%");
                                    break;
                                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                                    oc7Var = new oc7("ru-RU-DmitryNeural", "0%", "0%");
                                    break;
                                default:
                                    throw new RuntimeException();
                            }
                        } else if (str4.equals("ja")) {
                            int i6 = pq2.a[kq2Var.ordinal()];
                            if (i6 != 7 && i6 != 8 && i6 != 12 && i6 != 14 && i6 != 21 && i6 != 22) {
                                oc7Var = new oc7("ja-JP-KeitaNeural", "0%", "0%");
                            } else {
                                oc7Var = new oc7("ja-JP-NanamiNeural", "+2%", "0%");
                            }
                        } else {
                            switch (pq2.a[kq2Var.ordinal()]) {
                                case 1:
                                    oc7Var = new oc7("en-US-GuyNeural", "-16%", "-10%");
                                    break;
                                case 2:
                                    oc7Var = new oc7("en-US-RogerNeural", "-22%", "-14%");
                                    break;
                                case 3:
                                    oc7Var = new oc7("en-US-ChristopherNeural", "+28%", "+24%");
                                    break;
                                case 4:
                                    oc7Var = new oc7("en-US-RogerNeural", "-36%", "-20%");
                                    break;
                                case 5:
                                    oc7Var = new oc7("en-US-RogerNeural", "-12%", "-10%");
                                    break;
                                case 6:
                                    oc7Var = new oc7("en-US-AnaNeural", "+22%", "+12%");
                                    break;
                                case 7:
                                    oc7Var = new oc7("en-US-AnaNeural", "+30%", "+10%");
                                    break;
                                case 8:
                                    oc7Var = new oc7("en-US-JennyNeural", "+4%", "-4%");
                                    break;
                                case 9:
                                    oc7Var = new oc7("en-US-GuyNeural", "+10%", "+14%");
                                    break;
                                case 10:
                                    oc7Var = new oc7("en-US-GuyNeural", "-8%", "+4%");
                                    break;
                                case 11:
                                    oc7Var = new oc7("en-US-GuyNeural", "-14%", "+6%");
                                    break;
                                case 12:
                                    oc7Var = new oc7("en-US-JennyNeural", "+16%", "+16%");
                                    break;
                                case 13:
                                    oc7Var = new oc7("en-US-AnaNeural", "-4%", "-20%");
                                    break;
                                case 14:
                                    oc7Var = new oc7("en-US-AnaNeural", "+42%", "+18%");
                                    break;
                                case 15:
                                    oc7Var = new oc7("en-US-GuyNeural", "-6%", "+10%");
                                    break;
                                case 16:
                                    oc7Var = new oc7("en-US-ChristopherNeural", "+30%", "+20%");
                                    break;
                                case 17:
                                    oc7Var = new oc7("en-US-GuyNeural", "-4%", "-4%");
                                    break;
                                case 18:
                                    oc7Var = new oc7("en-US-AnaNeural", "+10%", "-28%");
                                    break;
                                case 19:
                                    oc7Var = new oc7("en-US-RogerNeural", "-10%", "-4%");
                                    break;
                                case 20:
                                    oc7Var = new oc7("en-US-ChristopherNeural", "+36%", "+26%");
                                    break;
                                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                    oc7Var = new oc7("en-US-JennyNeural", "+14%", "-6%");
                                    break;
                                case 22:
                                    oc7Var = new oc7("en-US-JennyNeural", "+2%", "0%");
                                    break;
                                case ConnectionResult.API_DISABLED /* 23 */:
                                    oc7Var = new oc7("en-US-GuyNeural", "+6%", "+2%");
                                    break;
                                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                                    oc7Var = new oc7("en-US-GuyNeural", "0%", "0%");
                                    break;
                                default:
                                    throw new RuntimeException();
                            }
                        }
                        l5 l5Var = new l5(str2, (String) oc7Var.A, (String) oc7Var.B, (String) oc7Var.L, null, 17);
                        vd1Var = this;
                        try {
                            vd1Var.Y = 1;
                            N = xk2.N(4500L, l5Var, vd1Var);
                            x61Var = x61Var3;
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            x61Var = x61Var3;
                            String message = th.getMessage();
                            StringBuilder sb = new StringBuilder("Routing [");
                            kq2 kq2Var3 = kq2Var;
                            sb.append(kq2Var3);
                            sb.append("] to local multi-voice synthesis: ");
                            sb.append(message);
                            Log.i("GameTtsManager", sb.toString());
                            xe1 xe1Var = xk1.a;
                            jv2 jv2Var = e04.a;
                            oq2 oq2Var = new oq2(vd1Var.Z, null, kq2Var3, (qq2) obj3, str2, (String) vd1Var.d0);
                            vd1Var.Y = 3;
                            break;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        vd1Var = this;
                    }
                }
                byte[] bArr = (byte[]) N;
                if (bArr != null && bArr.length != 0) {
                    qq2 qq2Var3 = qq2Var;
                    File file = new File(qq2Var3.a.getCacheDir(), str + System.currentTimeMillis() + ".mp3");
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(bArr);
                    fileOutputStream.close();
                    xe1 xe1Var2 = xk1.a;
                    jv2 jv2Var2 = e04.a;
                    nq2 nq2Var = new nq2(qq2Var3, file, f2, null);
                    vd1Var.Y = 2;
                    break;
                } else {
                    throw new IllegalStateException("Edge Neural fallback trigger");
                }
                break;
            default:
                final qn2 qn2Var = (qn2) obj5;
                ql6 ql6Var = (ql6) vd1Var.e0;
                ap3 ap3Var = ql6Var.a;
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i7 = vd1Var.Y;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            oi2.Y(obj);
                            return obj;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    f3 = 0.0f;
                    ah5Var2 = (ah5) vd1Var.d0;
                    b = obj;
                } else {
                    oi2.Y(obj);
                    float f9 = ((wo) new eb(ql6Var.b.a, 26).E(new wo(RecyclerView.B1), new wo(f7))).a;
                    ue1 ue1Var = (ue1) ap3Var.B;
                    vs4 vs4Var = ue1Var.m;
                    int o = ((cr4) vs4Var.getValue()).c + ue1Var.o();
                    if (o == 0) {
                        signum = 0.0f;
                        f3 = 0.0f;
                    } else {
                        int i8 = (f7 > RecyclerView.B1 ? 1 : (f7 == RecyclerView.B1 ? 0 : -1));
                        int i9 = ue1Var.e;
                        if (i8 < 0) {
                            i9++;
                        }
                        int q = gi2.q(((int) (f9 / o)) + i9, 0, ue1Var.n());
                        ue1Var.o();
                        int i10 = ((cr4) vs4Var.getValue()).c;
                        f3 = 0.0f;
                        long j2 = i9;
                        long j3 = j2 - 1;
                        if (j3 < 0) {
                            i = i9;
                            j = 0;
                        } else {
                            i = i9;
                            j = j3;
                        }
                        int i11 = (int) j;
                        long j4 = j2 + 1;
                        if (j4 > 2147483647L) {
                            j4 = 2147483647L;
                        }
                        int abs = Math.abs((gi2.q(gi2.q(q, i11, (int) j4), 0, ue1Var.n()) - i) * o) - o;
                        if (abs < 0) {
                            abs = 0;
                        }
                        if (abs == 0) {
                            signum = abs;
                        } else {
                            signum = Math.signum(f7) * abs;
                        }
                    }
                    if (Float.isNaN(signum)) {
                        s53.c("calculateApproachOffset returned NaN. Please use a valid value.");
                    }
                    final ?? obj7 = new Object();
                    float signum2 = Math.signum(f7) * Math.abs(signum);
                    obj7.A = signum2;
                    qn2Var.g(new Float(signum2));
                    float f10 = obj7.A;
                    ?? r4 = new qn2() { // from class: nl6
                        @Override // defpackage.qn2
                        public final Object g(Object obj8) {
                            int i12 = r3;
                            jg7 jg7Var = jg7.a;
                            qn2 qn2Var2 = qn2Var;
                            ah5 ah5Var3 = obj7;
                            float floatValue = ((Float) obj8).floatValue();
                            switch (i12) {
                                case 0:
                                    float f11 = ah5Var3.A - floatValue;
                                    ah5Var3.A = f11;
                                    qn2Var2.g(Float.valueOf(f11));
                                    return jg7Var;
                                default:
                                    float f12 = ah5Var3.A - floatValue;
                                    ah5Var3.A = f12;
                                    qn2Var2.g(Float.valueOf(f12));
                                    return jg7Var;
                            }
                        }
                    };
                    vd1Var.d0 = obj7;
                    vd1Var.Y = 1;
                    b = ql6.b(ql6Var, (p76) obj4, f10, vd1Var.Z, r4, vd1Var);
                    ah5Var2 = obj7;
                    if (b == x61Var4) {
                        return x61Var4;
                    }
                }
                uo uoVar2 = (uo) b;
                float floatValue = ((Number) uoVar2.a()).floatValue();
                ue1 ue1Var2 = (ue1) ap3Var.B;
                cs1 cs1Var = ue1Var2.m().n;
                List list = ue1Var2.m().a;
                int size = list.size();
                float f11 = Float.POSITIVE_INFINITY;
                float f12 = Float.NEGATIVE_INFINITY;
                while (i3 < size) {
                    i34 i34Var = (i34) list.get(i3);
                    gi2.G(ue1Var2.m());
                    float f13 = f3;
                    int i12 = ue1Var2.m().f;
                    int i13 = ue1Var2.m().d;
                    int i14 = ue1Var2.m().b;
                    int i15 = i34Var.j;
                    ue1Var2.n();
                    cs1Var.getClass();
                    float f14 = i15 - f13;
                    if (f14 <= f13 && f14 > f12) {
                        f12 = f14;
                    }
                    if (f14 >= f13 && f14 < f11) {
                        f11 = f14;
                    }
                    i3++;
                    f3 = f13;
                }
                float f15 = f3;
                if (f12 == Float.NEGATIVE_INFINITY) {
                    f4 = f11;
                } else {
                    f4 = f12;
                }
                if (f11 == Float.POSITIVE_INFINITY) {
                    f11 = f4;
                }
                if (!ue1Var2.c()) {
                    if (oi2.K(ue1Var2, floatValue)) {
                        f4 = f15;
                        f11 = f4;
                    } else {
                        f11 = f15;
                    }
                }
                if (!ue1Var2.b()) {
                    if (!oi2.K(ue1Var2, floatValue)) {
                        f5 = f15;
                        f4 = f5;
                    } else {
                        f5 = f11;
                        f4 = f15;
                    }
                } else {
                    f5 = f11;
                }
                float floatValue2 = ((Number) ((l4) ap3Var.L).e(Float.valueOf(floatValue), Float.valueOf(f4), Float.valueOf(f5))).floatValue();
                if (floatValue2 != f4 && floatValue2 != f5 && floatValue2 != f15) {
                    s53.c("Final Snapping Offset Should Be one of " + f4 + ", " + f5 + " or 0.0");
                }
                if (floatValue2 == Float.POSITIVE_INFINITY || floatValue2 == Float.NEGATIVE_INFINITY) {
                    f6 = f15;
                } else {
                    f6 = floatValue2;
                }
                if (Float.isNaN(f6)) {
                    s53.c("calculateSnapOffset returned NaN. Please use a valid value.");
                }
                ah5Var2.A = f6;
                uo O = ak7.O(uoVar2, f15, f15, 30);
                io6 io6Var = ql6Var.c;
                qn2 qn2Var2 = new qn2() { // from class: nl6
                    @Override // defpackage.qn2
                    public final Object g(Object obj8) {
                        int i122 = r3;
                        jg7 jg7Var = jg7.a;
                        qn2 qn2Var22 = qn2Var;
                        ah5 ah5Var3 = ah5Var2;
                        float floatValue3 = ((Float) obj8).floatValue();
                        switch (i122) {
                            case 0:
                                float f112 = ah5Var3.A - floatValue3;
                                ah5Var3.A = f112;
                                qn2Var22.g(Float.valueOf(f112));
                                return jg7Var;
                            default:
                                float f122 = ah5Var3.A - floatValue3;
                                ah5Var3.A = f122;
                                qn2Var22.g(Float.valueOf(f122));
                                return jg7Var;
                        }
                    }
                };
                vd1Var.d0 = null;
                vd1Var.Y = 2;
                Object j5 = kn2.j((p76) obj4, f6, f6, O, io6Var, qn2Var2, vd1Var);
                if (j5 != x61Var4) {
                    return j5;
                }
                return x61Var4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd1(float f, wd1 wd1Var, i86 i86Var, r41 r41Var) {
        super(2, r41Var);
        this.Z = f;
        this.f0 = wd1Var;
        this.g0 = i86Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd1(ql6 ql6Var, float f, qn2 qn2Var, p76 p76Var, r41 r41Var) {
        super(2, r41Var);
        this.e0 = ql6Var;
        this.Z = f;
        this.f0 = qn2Var;
        this.g0 = p76Var;
    }
}
