package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.util.Log;
import android.widget.Toast;
import com.github.junrar.unpack.decode.Compress;
import com.stormds.emulator.R;
import java.util.List;
import java.util.regex.Pattern;
import me.magnum.melonds.translator.ui.GameTranslationOverlayView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fq2  reason: default package */
/* loaded from: classes.dex */
public final class fq2 extends hw6 implements eo2 {
    public String X;
    public String Y;
    public List Z;
    public dh5 d0;
    public dh5 e0;
    public int f0;
    public final /* synthetic */ boolean g0;
    public final /* synthetic */ hq2 h0;
    public final /* synthetic */ Bitmap i0;
    public final /* synthetic */ List j0;
    public final /* synthetic */ boolean k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq2(boolean z, hq2 hq2Var, Bitmap bitmap, List list, boolean z2, r41 r41Var) {
        super(2, r41Var);
        this.g0 = z;
        this.h0 = hq2Var;
        this.i0 = bitmap;
        this.j0 = list;
        this.k0 = z2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((fq2) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new fq2(this.g0, this.h0, this.i0, this.j0, this.k0, r41Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:3|(1:4)|(14:143|144|145|146|147|148|149|(4:151|(3:153|(2:155|156)(1:158)|157)|159|160)|161|(1:163)|165|166|167|(2:180|181)(6:171|(2:173|174)(1:178)|175|(1:177)|74|75))(1:6)|7|(1:9)(1:142)|10|(1:12)(1:141)|13|(2:137|(9:139|16|17|18|19|20|21|22|(2:24|25)(1:27))(1:140))|15|16|17|18|19|20|21|22|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c1, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c2, code lost:
        r10 = null;
        r7 = r19;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0225, code lost:
        if (r0 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0227, code lost:
        r0.setTranslating(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x027f, code lost:
        if (r0 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0333, code lost:
        if (r0 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0337, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0338, code lost:
        r7 = r12;
        r10 = null;
        r2 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x037c, code lost:
        if (r0 == null) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d6 A[Catch: all -> 0x01be, TRY_LEAVE, TryCatch #11 {all -> 0x01be, blocks: (B:149:0x02f7, B:152:0x02fd, B:153:0x0304, B:155:0x030c, B:157:0x0314, B:99:0x01b3, B:102:0x01b9, B:108:0x01cc, B:110:0x01d6, B:113:0x01dc, B:114:0x01df, B:116:0x01e3, B:117:0x01e6, B:119:0x01ea, B:122:0x01f3, B:124:0x01f9, B:127:0x0203, B:129:0x021c, B:128:0x0215, B:133:0x022c, B:135:0x0267, B:137:0x026e, B:139:0x0276, B:141:0x027a, B:145:0x0282, B:95:0x0198), top: B:210:0x0198 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022c A[Catch: all -> 0x01be, TRY_ENTER, TryCatch #11 {all -> 0x01be, blocks: (B:149:0x02f7, B:152:0x02fd, B:153:0x0304, B:155:0x030c, B:157:0x0314, B:99:0x01b3, B:102:0x01b9, B:108:0x01cc, B:110:0x01d6, B:113:0x01dc, B:114:0x01df, B:116:0x01e3, B:117:0x01e6, B:119:0x01ea, B:122:0x01f3, B:124:0x01f9, B:127:0x0203, B:129:0x021c, B:128:0x0215, B:133:0x022c, B:135:0x0267, B:137:0x026e, B:139:0x0276, B:141:0x027a, B:145:0x0282, B:95:0x0198), top: B:210:0x0198 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02fd A[Catch: all -> 0x01be, TRY_ENTER, TryCatch #11 {all -> 0x01be, blocks: (B:149:0x02f7, B:152:0x02fd, B:153:0x0304, B:155:0x030c, B:157:0x0314, B:99:0x01b3, B:102:0x01b9, B:108:0x01cc, B:110:0x01d6, B:113:0x01dc, B:114:0x01df, B:116:0x01e3, B:117:0x01e6, B:119:0x01ea, B:122:0x01f3, B:124:0x01f9, B:127:0x0203, B:129:0x021c, B:128:0x0215, B:133:0x022c, B:135:0x0267, B:137:0x026e, B:139:0x0276, B:141:0x027a, B:145:0x0282, B:95:0x0198), top: B:210:0x0198 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0348 A[Catch: all -> 0x0357, TryCatch #7 {all -> 0x0357, blocks: (B:163:0x033d, B:165:0x0348, B:175:0x0366, B:177:0x0373, B:174:0x0359), top: B:203:0x033d }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0373 A[Catch: all -> 0x0357, TRY_LEAVE, TryCatch #7 {all -> 0x0357, blocks: (B:163:0x033d, B:165:0x0348, B:175:0x0366, B:177:0x0373, B:174:0x0359), top: B:203:0x033d }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0171  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v8, types: [dh5, java.util.List, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [me.magnum.melonds.translator.ui.GameTranslationOverlayView] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v24, types: [dh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v25 */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        char c;
        dh5 dh5Var;
        boolean z;
        int i;
        hq2 hq2Var;
        Object obj2;
        String str;
        String str2;
        yt1 yt1Var;
        dh5 dh5Var2;
        boolean z2;
        String str3;
        hq2 hq2Var2;
        String str4;
        dh5 dh5Var3;
        boolean z3;
        dh5 dh5Var4;
        Object obj3;
        dh5 dh5Var5;
        String str5;
        boolean z4;
        String str6;
        ?? r2;
        String message;
        GameTranslationOverlayView gameTranslationOverlayView;
        SharedPreferences sharedPreferences;
        boolean z5;
        GameTranslationOverlayView gameTranslationOverlayView2;
        ?? r10;
        dh5 dh5Var6;
        boolean z6;
        String string;
        List list;
        long j;
        boolean z7;
        boolean z8;
        String str7 = "ru";
        String str8 = "auto";
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i2 = this.f0;
        Bitmap bitmap = this.i0;
        yt1 yt1Var2 = yt1.A;
        boolean z9 = this.g0;
        char c2 = 3;
        int i3 = 2;
        int i4 = 0;
        hq2 hq2Var3 = this.h0;
        if (i2 != 0) {
            try {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            String str9 = (String) this.e0;
                            dh5Var5 = this.d0;
                            str5 = this.Y;
                            oi2.Y(obj);
                            z4 = false;
                            hq2Var2 = hq2Var3;
                            gameTranslationOverlayView = hq2Var2.l;
                            sharedPreferences = hq2Var2.f;
                            if (gameTranslationOverlayView != null) {
                                gameTranslationOverlayView.setTranslatedBlocks((List) dh5Var5.A);
                            }
                            if (!sharedPreferences.getBoolean("translator_tts_enabled", z4) || sharedPreferences.getBoolean("translator_local_voice_actor_studio", z4)) {
                                hq2Var2.g(gt0.P0((Iterable) dh5Var5.A, ". ", null, null, new bz1(19), 30), str5);
                            }
                            GameTranslationOverlayView gameTranslationOverlayView3 = hq2Var2.l;
                            gameTranslationOverlayView2 = gameTranslationOverlayView3;
                            z5 = z4;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        dh5 dh5Var7 = this.e0;
                        dh5 dh5Var8 = this.d0;
                        String str10 = this.Y;
                        str3 = this.X;
                        oi2.Y(obj);
                        z = z9;
                        hq2Var2 = hq2Var3;
                        str4 = null;
                        dh5Var3 = dh5Var8;
                        str2 = str10;
                        z3 = false;
                        dh5Var4 = dh5Var7;
                        obj3 = obj;
                        list = (List) obj3;
                        if (list == null) {
                            list = yt1Var2;
                        }
                        dh5Var4.A = list;
                        dh5Var6 = dh5Var3;
                        str = str3;
                        z6 = z3;
                        r10 = str4;
                        if (((List) dh5Var6.A).isEmpty()) {
                            GameTranslationOverlayView gameTranslationOverlayView4 = hq2Var2.l;
                            Activity activity = hq2Var2.a;
                            if (gameTranslationOverlayView4 != null) {
                                gameTranslationOverlayView4.a();
                            }
                            GameTranslationOverlayView gameTranslationOverlayView5 = hq2Var2.l;
                            if (gameTranslationOverlayView5 != null) {
                                gameTranslationOverlayView5.setTranslating(z6);
                            }
                            if (hq2Var2.n) {
                                hq2Var2.n = z6;
                                try {
                                    hq2Var2.e.c();
                                } catch (Throwable unused) {
                                }
                            }
                            if (!z) {
                                String str11 = hq2Var2.h.a;
                                if (str11 != null && !qs6.v0(str11)) {
                                    string = "OCR: " + str11;
                                } else {
                                    string = activity.getString(R.string.translator_no_text_found);
                                    string.getClass();
                                }
                                Toast.makeText(activity, string, z6 ? 1 : 0).show();
                            }
                            GameTranslationOverlayView gameTranslationOverlayView6 = hq2Var2.l;
                            gameTranslationOverlayView2 = gameTranslationOverlayView6;
                            z5 = z6;
                        } else {
                            String P0 = gt0.P0((Iterable) dh5Var6.A, " ", null, null, new bz1(18), 30);
                            Pattern compile = Pattern.compile("\\s+");
                            compile.getClass();
                            String replaceAll = compile.matcher(P0).replaceAll(" ");
                            replaceAll.getClass();
                            String obj4 = qs6.T0(replaceAll).toString();
                            if (z && (obj4.length() < 3 || obj4.equals(hq2Var2.w))) {
                                GameTranslationOverlayView gameTranslationOverlayView7 = hq2Var2.l;
                                if (gameTranslationOverlayView7 != null) {
                                    gameTranslationOverlayView7.setTranslating(z6);
                                }
                                GameTranslationOverlayView gameTranslationOverlayView8 = hq2Var2.l;
                                gameTranslationOverlayView2 = gameTranslationOverlayView8;
                                z5 = z6;
                            } else {
                                hq2Var2.w = obj4;
                                f13 a = hq2.a(hq2Var2);
                                Log.i("GameTranslatorManager", "Translating " + ((List) dh5Var6.A).size() + " blocks with " + a.getClass().getSimpleName() + " (" + str + " -> " + str2 + ")");
                                dh5 dh5Var9 = dh5Var6;
                                ji jiVar = new ji(dh5Var9, str, str2, this.h0, a, null, 8);
                                dh5Var5 = dh5Var9;
                                this.X = r10;
                                this.Y = str2;
                                this.Z = r10;
                                this.d0 = dh5Var5;
                                this.e0 = r10;
                                this.f0 = 3;
                                if (xk2.N(8000L, jiVar, this) != x61Var) {
                                    str5 = str2;
                                    z4 = z6;
                                    gameTranslationOverlayView = hq2Var2.l;
                                    sharedPreferences = hq2Var2.f;
                                    if (gameTranslationOverlayView != null) {
                                    }
                                    if (!sharedPreferences.getBoolean("translator_tts_enabled", z4)) {
                                    }
                                    hq2Var2.g(gt0.P0((Iterable) dh5Var5.A, ". ", null, null, new bz1(19), 30), str5);
                                    GameTranslationOverlayView gameTranslationOverlayView32 = hq2Var2.l;
                                    gameTranslationOverlayView2 = gameTranslationOverlayView32;
                                    z5 = z4;
                                }
                                return x61Var;
                            }
                        }
                    }
                } else {
                    dh5Var = this.e0;
                    dh5 dh5Var10 = this.d0;
                    ?? r4 = this.Z;
                    String str12 = this.Y;
                    String str13 = this.X;
                    oi2.Y(obj);
                    z = z9;
                    i = 2;
                    hq2Var = hq2Var3;
                    obj2 = obj;
                    str = str13;
                    str2 = str12;
                    yt1Var = r4;
                    dh5Var2 = dh5Var10;
                    z2 = false;
                }
            } catch (Throwable th) {
                th = th;
                c = 0;
                hq2Var2 = hq2Var3;
                str6 = null;
                r2 = c;
                try {
                    Log.e("GameTranslatorManager", "Process captured frame failed", th);
                    message = th.getMessage();
                    if (message != null) {
                    }
                    message = hq2Var2.a.getString(R.string.translator_no_text_found);
                    message.getClass();
                    Toast.makeText(hq2Var2.a, message, (int) r2).show();
                    if (hq2Var2.n) {
                    }
                    GameTranslationOverlayView gameTranslationOverlayView9 = hq2Var2.l;
                    gameTranslationOverlayView2 = gameTranslationOverlayView9;
                    z5 = r2;
                } finally {
                    ?? r1 = hq2Var2.l;
                    if (r1 != 0) {
                        r1.setTranslating(r2);
                    }
                }
            }
        } else {
            oi2.Y(obj);
            try {
            } catch (Throwable th2) {
                th = th2;
            }
            if (z9) {
                try {
                    hq2Var3.getClass();
                    int i5 = 8;
                    try {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 9, 8, false);
                        try {
                            createScaledBitmap.getClass();
                            int i6 = 0;
                            long j2 = 0;
                            while (i6 < i5) {
                                int i7 = i4;
                                while (i7 < i5) {
                                    int pixel = createScaledBitmap.getPixel(i7, i6);
                                    int i8 = i7 + 1;
                                    int pixel2 = createScaledBitmap.getPixel(i8, i6);
                                    if ((((pixel & 255) * 114) + ((((pixel >> 8) & 255) * 587) + (((pixel >> 16) & 255) * Compress.NC))) / 1000 > (((pixel2 & 255) * 114) + ((((pixel2 >> 8) & 255) * 587) + (((pixel2 >> 16) & 255) * Compress.NC))) / 1000) {
                                        j2 |= 1 << ((i6 * 8) + i7);
                                    }
                                    i7 = i8;
                                    i5 = 8;
                                }
                                i6++;
                                i5 = 8;
                                i4 = 0;
                            }
                            if (createScaledBitmap != bitmap) {
                                createScaledBitmap.recycle();
                            }
                            j = j2;
                        } catch (Throwable th3) {
                            th = th3;
                            c2 = 0;
                            c = c2;
                            hq2Var2 = hq2Var3;
                            str6 = null;
                            r2 = c;
                            Log.e("GameTranslatorManager", "Process captured frame failed", th);
                            message = th.getMessage();
                            if (message != null) {
                                if (qs6.v0(message)) {
                                    message = str6;
                                }
                                if (message == null) {
                                }
                                Toast.makeText(hq2Var2.a, message, (int) r2).show();
                                if (hq2Var2.n) {
                                    hq2Var2.n = r2;
                                    try {
                                        hq2Var2.e.c();
                                    } catch (Throwable unused2) {
                                    }
                                }
                                GameTranslationOverlayView gameTranslationOverlayView92 = hq2Var2.l;
                                gameTranslationOverlayView2 = gameTranslationOverlayView92;
                                z5 = r2;
                            }
                            message = hq2Var2.a.getString(R.string.translator_no_text_found);
                            message.getClass();
                            Toast.makeText(hq2Var2.a, message, (int) r2).show();
                            if (hq2Var2.n) {
                            }
                            GameTranslationOverlayView gameTranslationOverlayView922 = hq2Var2.l;
                            gameTranslationOverlayView2 = gameTranslationOverlayView922;
                            z5 = r2;
                        }
                    } catch (Throwable unused3) {
                        j = 0;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    c2 = 0;
                }
                try {
                    i3 = 2;
                } catch (Throwable th5) {
                    th = th5;
                    c2 = 0;
                    c = c2;
                    hq2Var2 = hq2Var3;
                    str6 = null;
                    r2 = c;
                    Log.e("GameTranslatorManager", "Process captured frame failed", th);
                    message = th.getMessage();
                    if (message != null) {
                    }
                    message = hq2Var2.a.getString(R.string.translator_no_text_found);
                    message.getClass();
                    Toast.makeText(hq2Var2.a, message, (int) r2).show();
                    if (hq2Var2.n) {
                    }
                    GameTranslationOverlayView gameTranslationOverlayView9222 = hq2Var2.l;
                    gameTranslationOverlayView2 = gameTranslationOverlayView9222;
                    z5 = r2;
                }
                if (Long.bitCount(hq2Var3.v ^ j) <= 2 && hq2Var3.v != 0) {
                    GameTranslationOverlayView gameTranslationOverlayView10 = hq2Var3.l;
                    if (gameTranslationOverlayView10 != null) {
                        z8 = false;
                        gameTranslationOverlayView10.setTranslating(false);
                    } else {
                        z8 = false;
                    }
                    GameTranslationOverlayView gameTranslationOverlayView11 = hq2Var3.l;
                    if (gameTranslationOverlayView11 != null) {
                        gameTranslationOverlayView11.setTranslating(z8);
                    }
                    return jg7.a;
                }
                z7 = false;
                hq2Var3.v = j;
            } else {
                z7 = false;
            }
            String string2 = hq2Var3.f.getString("translator_source_lang", "auto");
            if (string2 != null) {
                str8 = string2;
            }
            String string3 = hq2Var3.f.getString("translator_target_lang", "ru");
            if (string3 != null) {
                str7 = string3;
            }
            List list2 = this.j0;
            if (list2 == null) {
                if (this.k0) {
                    yt1Var = yt1Var2;
                    ?? obj5 = new Object();
                    z = z9;
                    boolean z10 = z7;
                    hq2Var = hq2Var3;
                    i = i3;
                    str = str8;
                    z2 = z10;
                    l5 l5Var = new l5(this.h0, bitmap, str, yt1Var, null, 16);
                    this.X = str;
                    this.Y = str7;
                    this.Z = yt1Var;
                    this.d0 = obj5;
                    this.e0 = obj5;
                    this.f0 = 1;
                    obj2 = xk2.N(8000L, l5Var, this);
                    if (obj2 == x61Var) {
                        str2 = str7;
                        dh5Var = obj5;
                        z2 = z2;
                        dh5Var2 = obj5;
                    } else {
                        return x61Var;
                    }
                } else {
                    list2 = hq2Var3.e();
                }
            }
            yt1Var = list2;
            ?? obj52 = new Object();
            z = z9;
            boolean z102 = z7;
            hq2Var = hq2Var3;
            i = i3;
            str = str8;
            z2 = z102;
            l5 l5Var2 = new l5(this.h0, bitmap, str, yt1Var, null, 16);
            this.X = str;
            this.Y = str7;
            this.Z = yt1Var;
            this.d0 = obj52;
            this.e0 = obj52;
            this.f0 = 1;
            obj2 = xk2.N(8000L, l5Var2, this);
            if (obj2 == x61Var) {
            }
        }
        List list3 = (List) obj2;
        if (list3 == null) {
            list3 = yt1Var2;
        }
        dh5Var.A = list3;
        if (((List) dh5Var2.A).isEmpty() && !yt1Var.isEmpty()) {
            Log.i("GameTranslatorManager", "Custom regions returned 0 blocks, executing fullscreen fallback...");
            String str14 = null;
            hq2Var2 = hq2Var;
            try {
                u12 u12Var = new u12(hq2Var2, bitmap, str, (r41) null, 10);
                this.X = str;
                this.Y = str2;
                this.Z = null;
                this.d0 = dh5Var2;
                this.e0 = dh5Var2;
                this.f0 = i;
                obj3 = xk2.N(8000L, u12Var, this);
                if (obj3 != x61Var) {
                    dh5Var3 = dh5Var2;
                    str3 = str;
                    z3 = z2;
                    dh5Var4 = dh5Var2;
                    str4 = str14;
                    list = (List) obj3;
                    if (list == null) {
                    }
                    dh5Var4.A = list;
                    dh5Var6 = dh5Var3;
                    str = str3;
                    z6 = z3;
                    r10 = str4;
                    if (((List) dh5Var6.A).isEmpty()) {
                    }
                } else {
                    return x61Var;
                }
            } catch (Throwable th6) {
                th = th6;
                r2 = z2;
                str6 = str14;
                Log.e("GameTranslatorManager", "Process captured frame failed", th);
                message = th.getMessage();
                if (message != null) {
                }
                message = hq2Var2.a.getString(R.string.translator_no_text_found);
                message.getClass();
                Toast.makeText(hq2Var2.a, message, (int) r2).show();
                if (hq2Var2.n) {
                }
                GameTranslationOverlayView gameTranslationOverlayView92222 = hq2Var2.l;
                gameTranslationOverlayView2 = gameTranslationOverlayView92222;
                z5 = r2;
            }
        } else {
            r10 = 0;
            hq2Var2 = hq2Var;
            z6 = z2;
            dh5Var6 = dh5Var2;
            if (((List) dh5Var6.A).isEmpty()) {
            }
        }
    }
}
