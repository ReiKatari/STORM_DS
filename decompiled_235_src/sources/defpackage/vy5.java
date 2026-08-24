package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.core.graphics.drawable.IconCompat;
import com.stormds.emulator.R;
import java.util.concurrent.locks.ReentrantLock;
import me.magnum.melonds.ui.romlist.a;
import me.magnum.melonds.ui.shortcutsetup.ShortcutSetupActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vy5  reason: default package */
/* loaded from: classes.dex */
public final class vy5 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public Object Z;
    public Object d0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy5(ShortcutSetupActivity shortcutSetupActivity, pq5 pq5Var, Intent intent, r41 r41Var) {
        super(2, r41Var);
        this.X = 7;
        this.Z = shortcutSetupActivity;
        this.e0 = pq5Var;
        this.d0 = intent;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((vy5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 1:
                return ((vy5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 2:
                return ((vy5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 3:
                return ((vy5) q((r41) obj2, (k86) obj)).s(jg7Var);
            case 4:
                return ((vy5) q((r41) obj2, (p76) obj)).s(jg7Var);
            case 5:
                return ((vy5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 6:
                return ((vy5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 7:
                return ((vy5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 8:
                return ((vy5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 9:
                return ((vy5) q((r41) obj2, (q35) obj)).s(jg7Var);
            case 10:
                return ((vy5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 11:
                return ((vy5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 12:
                return ((vy5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 13:
                return ((vy5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 14:
                return ((vy5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 15:
                return ((vy5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 16:
                return ((vy5) q((r41) obj2, (d97) obj)).s(jg7Var);
            case 17:
                return ((vy5) q((r41) obj2, (mm1) obj)).s(jg7Var);
            case 18:
                return ((vy5) q((r41) obj2, (r35) obj)).s(jg7Var);
            case 19:
                return ((vy5) q((r41) obj2, (r35) obj)).s(jg7Var);
            case 20:
                return ((vy5) q((r41) obj2, (w61) obj)).s(jg7Var);
            default:
                return ((vy5) q((r41) obj2, (w61) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.e0;
        switch (i) {
            case 0:
                vy5 vy5Var = new vy5((a) this.d0, (pq5) obj2, r41Var, 0);
                vy5Var.Z = obj;
                return vy5Var;
            case 1:
                return new vy5((le2) this.Z, (le2) this.d0, (tz5) obj2, r41Var, 1);
            case 2:
                vy5 vy5Var2 = new vy5((tu0) this.d0, (eo2) obj2, r41Var, 2);
                vy5Var2.Z = obj;
                return vy5Var2;
            case 3:
                vy5 vy5Var3 = new vy5((xn1) this.d0, (m86) obj2, r41Var, 3);
                vy5Var3.Z = obj;
                return vy5Var3;
            case 4:
                vy5 vy5Var4 = new vy5((m86) this.d0, (eo2) obj2, r41Var, 4);
                vy5Var4.Z = obj;
                return vy5Var4;
            case 5:
                vy5 vy5Var5 = new vy5((pp6) this.d0, (gn) obj2, r41Var, 5);
                vy5Var5.Z = obj;
                return vy5Var5;
            case 6:
                return new vy5((u3) this.Z, (gn) this.d0, (qa4) obj2, r41Var, 6);
            case 7:
                return new vy5((ShortcutSetupActivity) this.Z, (pq5) obj2, (Intent) this.d0, r41Var);
            case 8:
                return new vy5((qj6) this.Z, (xa4) this.d0, (eo2) obj2, r41Var, 8);
            case 9:
                vy5 vy5Var6 = new vy5((l61) this.d0, (le2) obj2, r41Var, 9);
                vy5Var6.Z = obj;
                return vy5Var6;
            case 10:
                return new vy5((wq6) obj2, r41Var, 10);
            case 11:
                return new vy5((c27) this.Z, (j25) this.d0, (vy4) obj2, r41Var, 11);
            case 12:
                vy5 vy5Var7 = new vy5((rc3) this.d0, (eo2) obj2, r41Var, 12);
                vy5Var7.Z = obj;
                return vy5Var7;
            case 13:
                return new vy5((a17) this.d0, (u07) obj2, r41Var, 13);
            case 14:
                vy5 vy5Var8 = new vy5((zy4) this.d0, (o97) obj2, r41Var, 14);
                vy5Var8.Z = obj;
                return vy5Var8;
            case 15:
                return new vy5((gx0) obj2, r41Var, 15);
            case 16:
                vy5 vy5Var9 = new vy5((nc7) obj2, r41Var, 16);
                vy5Var9.Z = obj;
                return vy5Var9;
            case 17:
                vy5 vy5Var10 = new vy5((qh7) this.d0, (kt) obj2, r41Var, 17);
                vy5Var10.Z = obj;
                return vy5Var10;
            case 18:
                vy5 vy5Var11 = new vy5((j97) this.d0, (Context) obj2, r41Var, 18);
                vy5Var11.Z = obj;
                return vy5Var11;
            case 19:
                vy5 vy5Var12 = new vy5((j97) this.d0, (Activity) obj2, r41Var, 19);
                vy5Var12.Z = obj;
                return vy5Var12;
            case 20:
                return new vy5((ww2) this.Z, (yw7) this.d0, (ll4) obj2, r41Var, 20);
            default:
                return new vy5((rx7) this.Z, (nx3) this.d0, (fw7) obj2, r41Var, 21);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0224, code lost:
        if (r15 != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0362, code lost:
        if (((defpackage.u07) r22.e0).a(r5, r22) == r6) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x036e, code lost:
        if (r1 == r6) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
        if (r2 == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03b3, code lost:
        if (((defpackage.rc3) r22.d0).c0(r22) == r0) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03c3, code lost:
        if (((defpackage.eo2) r22.e0).o(r1, r22) == r0) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0492, code lost:
        if (r0.b(r1, r22) == r2) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x04a2, code lost:
        if (defpackage.hv.d0(r1, r5, r22) == r2) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x060e, code lost:
        if (defpackage.q60.u(r7, r22) == r6) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0625, code lost:
        if (defpackage.q60.u(r7, r22) == r6) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x064a, code lost:
        if (defpackage.gn.c((defpackage.gn) r22.d0, r1, null, null, r22, 14) == r6) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:?, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:?, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:?, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c8, code lost:
        if (r3 == r1) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0748  */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Object em5Var;
        Object em5Var2;
        Object d0;
        tu0 tu0Var;
        tu0 tu0Var2;
        Object o;
        Throwable a;
        Object n;
        boolean z;
        wq6 wq6Var;
        hb4 hb4Var;
        w61 w61Var;
        hb4 hb4Var2;
        d97 d97Var;
        Boolean bool;
        di4 di4Var;
        ReentrantLock reentrantLock;
        ci4[] ci4VarArr;
        boolean z2;
        ci4 ci4Var;
        di4 di4Var2;
        ReentrantLock reentrantLock2;
        boolean z3;
        boolean z4 = false;
        switch (this.X) {
            case 0:
                jg7 jg7Var = jg7.a;
                a aVar = (a) this.d0;
                w61 w61Var2 = (w61) this.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i = this.Y;
                try {
                    if (i != 0) {
                        if (i == 1) {
                            oi2.Y(obj);
                            d0 = obj;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        pq5 pq5Var = (pq5) this.e0;
                        xe1 xe1Var = xk1.a;
                        de1 de1Var = de1.L;
                        m5 m5Var = new m5(aVar, pq5Var, (r41) null, 29);
                        this.Z = w61Var2;
                        this.Y = 1;
                        d0 = hv.d0(de1Var, m5Var, this);
                        if (d0 == x61Var) {
                            return x61Var;
                        }
                    }
                    em5Var = (k06) d0;
                } catch (Throwable th) {
                    em5Var = new em5(th);
                }
                if (hm5.a(em5Var) == null) {
                    k06 k06Var = (k06) em5Var;
                    if (k06Var == null) {
                        Toast.makeText(aVar.requireContext(), (int) R.string.rom_save_file_missing, 1).show();
                    } else {
                        String str = k06Var.b;
                        Uri uri = k06Var.a;
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("*/*");
                        intent.putExtra("android.intent.extra.STREAM", uri);
                        intent.putExtra("android.intent.extra.TITLE", str);
                        intent.addFlags(1);
                        intent.setClipData(ClipData.newUri(aVar.requireContext().getContentResolver(), str, uri));
                        try {
                            aVar.startActivity(Intent.createChooser(intent, aVar.getString(R.string.rom_save_file_share_chooser)));
                            em5Var2 = jg7Var;
                        } catch (Throwable th2) {
                            em5Var2 = new em5(th2);
                        }
                        if (hm5.a(em5Var2) != null) {
                            Toast.makeText(aVar.requireContext(), (int) R.string.rom_save_file_share_failed, 1).show();
                        }
                    }
                } else {
                    Toast.makeText(aVar.requireContext(), (int) R.string.rom_save_file_share_failed, 1).show();
                }
                return jg7Var;
            case 1:
                jg7 jg7Var2 = jg7.a;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    tz5 tz5Var = (tz5) this.e0;
                    le2[] le2VarArr = {(le2) this.Z, (le2) this.d0, tz5Var.G, tz5Var.F, tz5Var.r, tz5Var.s};
                    bz5 bz5Var = new bz5(tz5Var, 2);
                    this.Y = 1;
                    Object o2 = nb3.o(this, bz5Var, new h32(le2VarArr, 1), new ez5(null, tz5Var), le2VarArr);
                    if (o2 != x61Var2) {
                        o2 = jg7Var2;
                    }
                    if (o2 == x61Var2) {
                        return x61Var2;
                    }
                }
                return jg7Var2;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        tu0Var2 = (tu0) this.Z;
                        try {
                            oi2.Y(obj);
                            tu0Var = tu0Var2;
                            o = obj;
                        } catch (Throwable th3) {
                            th = th3;
                            tu0Var = tu0Var2;
                            o = new em5(th);
                            a = hm5.a(o);
                            if (a == null) {
                            }
                            return jg7.a;
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    w61 w61Var3 = (w61) this.Z;
                    tu0Var = (tu0) this.d0;
                    eo2 eo2Var = (eo2) this.e0;
                    try {
                        this.Z = tu0Var;
                        this.Y = 1;
                        o = eo2Var.o(w61Var3, this);
                        if (o == x61Var3) {
                            return x61Var3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        tu0Var2 = tu0Var;
                        tu0Var = tu0Var2;
                        o = new em5(th);
                        a = hm5.a(o);
                        if (a == null) {
                        }
                        return jg7.a;
                    }
                }
                a = hm5.a(o);
                if (a == null) {
                    tu0Var.b0(o);
                } else {
                    tu0Var.v0(a);
                }
                return jg7.a;
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    qk4 qk4Var = new qk4(17, (k86) this.Z, (m86) this.e0);
                    this.Y = 1;
                    if (((xn1) this.d0).o(qk4Var, this) == x61Var4) {
                        return x61Var4;
                    }
                }
                return jg7.a;
            case 4:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    m86 m86Var = (m86) this.d0;
                    m86Var.k = (p76) this.Z;
                    k86 k86Var = m86Var.l;
                    this.Y = 1;
                    if (((eo2) this.e0).o(k86Var, this) == x61Var5) {
                        return x61Var5;
                    }
                }
                return jg7.a;
            case 5:
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    g21 f0 = np2.f0(new vc4((pp6) this.d0, 2));
                    zb0 zb0Var = new zb0(16, (gn) this.e0, (w61) this.Z);
                    this.Y = 1;
                    if (f0.b(zb0Var, this) == x61Var6) {
                        return x61Var6;
                    }
                }
                return jg7.a;
            case 6:
                qa4 qa4Var = (qa4) this.e0;
                x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                int i7 = this.Y;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 == 3) {
                                oi2.Y(obj);
                                return jg7.a;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj);
                        qa4Var.setValue(Boolean.FALSE);
                        u3 u3Var = (u3) this.Z;
                        if (u3Var.b) {
                            Float f = new Float(0.5f);
                            this.Y = 3;
                            break;
                        } else {
                            u3Var.c.E();
                        }
                        return jg7.a;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    jd1 jd1Var = oq1.B;
                    long L = n16.L(500, uq1.MILLISECONDS);
                    this.Y = 1;
                    break;
                }
                qa4Var.setValue(Boolean.TRUE);
                jd1 jd1Var2 = oq1.B;
                long L2 = n16.L(3, uq1.SECONDS);
                this.Y = 2;
                break;
            case 7:
                pq5 pq5Var2 = (pq5) this.e0;
                ShortcutSetupActivity shortcutSetupActivity = (ShortcutSetupActivity) this.Z;
                x61 x61Var8 = x61.COROUTINE_SUSPENDED;
                int i8 = this.Y;
                if (i8 != 0) {
                    if (i8 == 1) {
                        oi2.Y(obj);
                        n = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    n = ((tz5) shortcutSetupActivity.B0.getValue()).n(pq5Var2, this);
                    if (n == x61Var8) {
                        return x61Var8;
                    }
                }
                ix5 ix5Var = (ix5) n;
                String uri2 = pq5Var2.d.toString();
                pa paVar = new pa(11, false);
                paVar.B = shortcutSetupActivity;
                paVar.L = uri2;
                paVar.X = pq5Var2.a;
                int i9 = ShortcutSetupActivity.C0;
                Bitmap bitmap = ix5Var.a;
                if (bitmap == null) {
                    bitmap = BitmapFactory.decodeResource(shortcutSetupActivity.getResources(), R.drawable.logo_splash);
                }
                Bitmap createBitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Rect rect = new Rect(0, 0, canvas.getWidth(), canvas.getHeight());
                Paint paint = new Paint();
                paint.setColor(-1);
                canvas.drawRect(rect, paint);
                Rect rect2 = new Rect(77, 77, createBitmap.getWidth() - 77, createBitmap.getHeight() - 77);
                Paint paint2 = new Paint();
                if (ix5Var.b == jx5.LINEAR) {
                    z = true;
                } else {
                    z = false;
                }
                paint2.setFilterBitmap(z);
                canvas.drawBitmap(bitmap, (Rect) null, rect2, paint2);
                IconCompat iconCompat = new IconCompat(5);
                iconCompat.b = createBitmap;
                paVar.Y = iconCompat;
                paVar.R = new Intent[]{(Intent) this.d0};
                if (!TextUtils.isEmpty((CharSequence) paVar.X)) {
                    Intent[] intentArr = (Intent[]) paVar.R;
                    if (intentArr != null && intentArr.length != 0) {
                        shortcutSetupActivity.setResult(-1, qo2.t(shortcutSetupActivity, paVar));
                        shortcutSetupActivity.finish();
                        return jg7.a;
                    }
                    i.h("Shortcut must have an intent");
                    return null;
                }
                i.h("Shortcut must have a non-empty label");
                return null;
            case 8:
                qj6 qj6Var = (qj6) this.Z;
                vs4 vs4Var = qj6Var.B;
                x61 x61Var9 = x61.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    vs4Var.setValue(Boolean.TRUE);
                    db4 db4Var = qj6Var.R;
                    cd cdVar = qj6Var.L;
                    this.Y = 1;
                    db4Var.getClass();
                    if (g04.C(new cb4((xa4) this.d0, db4Var, (eo2) this.e0, cdVar, null), this) == x61Var9) {
                        return x61Var9;
                    }
                }
                vs4Var.setValue(Boolean.FALSE);
                return jg7.a;
            case 9:
                le2 le2Var = (le2) this.e0;
                l61 l61Var = (l61) this.d0;
                x61 x61Var10 = x61.COROUTINE_SUSPENDED;
                int i11 = this.Y;
                if (i11 != 0) {
                    if (i11 != 1 && i11 != 2) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    q35 q35Var = (q35) this.Z;
                    if (nb3.k(l61Var, vt1.A)) {
                        qe2 qe2Var = new qe2(q35Var, 1);
                        this.Y = 1;
                        break;
                    } else {
                        re2 re2Var = new re2(le2Var, q35Var, null, 1);
                        this.Y = 2;
                        break;
                    }
                }
                return jg7.a;
            case 10:
                x61 x61Var11 = x61.COROUTINE_SUSPENDED;
                int i12 = this.Y;
                if (i12 != 0) {
                    if (i12 == 1) {
                        wq6Var = (wq6) this.d0;
                        hb4Var = (hb4) this.Z;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    wq6 wq6Var2 = (wq6) this.e0;
                    hb4 hb4Var3 = wq6Var2.c;
                    this.Z = hb4Var3;
                    this.d0 = wq6Var2;
                    this.Y = 1;
                    if (hb4Var3.e(this) == x61Var11) {
                        return x61Var11;
                    }
                    wq6Var = wq6Var2;
                    hb4Var = hb4Var3;
                }
                while (!wq6Var.e.isEmpty()) {
                    try {
                        uq6 uq6Var = (uq6) wq6Var.e.poll();
                    } finally {
                        hb4Var.h(null);
                    }
                }
                hb4Var.h(null);
                return jg7.a;
            case 11:
                jg7 jg7Var3 = jg7.a;
                x61 x61Var12 = x61.COROUTINE_SUSPENDED;
                int i13 = this.Y;
                if (i13 != 0) {
                    if (i13 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    c27 c27Var = (c27) this.Z;
                    long j = ((vy4) this.e0).c;
                    this.Y = 1;
                    c27 c27Var2 = new c27(c27Var.d0, c27Var.e0, c27Var.f0, this);
                    c27Var2.Y = (j25) this.d0;
                    c27Var2.Z = j;
                    if (c27Var2.s(jg7Var3) == x61Var12) {
                        return x61Var12;
                    }
                }
                return jg7Var3;
            case 12:
                x61 x61Var13 = x61.COROUTINE_SUSPENDED;
                int i14 = this.Y;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            oi2.Y(obj);
                            return jg7.a;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w61Var = (w61) this.Z;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    w61Var = (w61) this.Z;
                    this.Z = w61Var;
                    this.Y = 1;
                    break;
                }
                this.Z = null;
                this.Y = 2;
                break;
            case 13:
                jg7 jg7Var4 = jg7.a;
                a17 a17Var = (a17) this.d0;
                x61 x61Var14 = x61.COROUTINE_SUSPENDED;
                int i15 = this.Y;
                try {
                } catch (Throwable th5) {
                    k27 k27Var = a17Var.o0;
                    if (k27Var != null) {
                        this.Z = th5;
                        this.Y = 4;
                        k27Var.g(this);
                        if (jg7Var4 != x61Var14) {
                            throw th5;
                        }
                    } else {
                        throw th5;
                    }
                }
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                if (i15 != 4) {
                                    i.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                Throwable th6 = (Throwable) this.Z;
                                oi2.Y(obj);
                                throw th6;
                            }
                            oi2.Y(obj);
                            return jg7Var4;
                        }
                        oi2.Y(obj);
                        k27 k27Var2 = a17Var.o0;
                        if (k27Var2 != null) {
                            this.Y = 3;
                            k27Var2.g(this);
                            break;
                        }
                        return jg7Var4;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    wc0 wc0Var = a17Var.n0;
                    if (wc0Var != null) {
                        this.Y = 1;
                        if (wc0Var.g(this) == x61Var14) {
                            return x61Var14;
                        }
                    }
                }
                this.Y = 2;
                break;
            case 14:
                o97 o97Var = (o97) this.e0;
                x61 x61Var15 = x61.COROUTINE_SUSPENDED;
                int i16 = this.Y;
                if (i16 != 0) {
                    if (i16 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    w61 w61Var4 = (w61) this.Z;
                    hv.L(w61Var4, null, a71.UNDISPATCHED, new n97(o97Var, null), 1);
                    tj2 tj2Var = new tj2(o97Var, w61Var4, null, 4);
                    this.Y = 1;
                    if (uj2.o((zy4) this.d0, tj2Var, this) == x61Var15) {
                        return x61Var15;
                    }
                }
                return jg7.a;
            case 15:
                gx0 gx0Var = (gx0) this.e0;
                x61 x61Var16 = x61.COROUTINE_SUSPENDED;
                int i17 = this.Y;
                if (i17 != 0) {
                    if (i17 == 1) {
                        gx0Var = (gx0) this.d0;
                        hb4Var2 = (hb4) this.Z;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    n96 n96Var = (n96) gx0Var;
                    qm6 qm6Var = n96Var.h;
                    if (qm6Var != null) {
                        qm6Var.d(n96Var, n16.q, n96Var.g);
                    }
                    hb4 hb4Var4 = n96Var.k;
                    this.Z = hb4Var4;
                    this.d0 = gx0Var;
                    this.Y = 1;
                    if (hb4Var4.e(this) == x61Var16) {
                        return x61Var16;
                    }
                    hb4Var2 = hb4Var4;
                }
                try {
                    ((n96) gx0Var).d = ((n96) gx0Var).b.getValue();
                    rj0 rj0Var = ((n96) gx0Var).j;
                    if (rj0Var != null) {
                        rj0Var.i(((n96) gx0Var).b.getValue());
                    }
                    ((n96) gx0Var).j = null;
                    hb4Var2.h(null);
                    return jg7.a;
                } catch (Throwable th7) {
                    throw th7;
                }
            case 16:
                jg7 jg7Var5 = jg7.a;
                x61 x61Var17 = x61.COROUTINE_SUSPENDED;
                int i18 = this.Y;
                if (i18 != 0) {
                    if (i18 != 1) {
                        if (i18 == 2) {
                            reentrantLock2 = (ReentrantLock) this.d0;
                            di4Var2 = (di4) this.Z;
                            try {
                                oi2.Y(obj);
                                reentrantLock = reentrantLock2;
                                di4Var = di4Var2;
                                di4Var.f = false;
                                reentrantLock.unlock();
                                return jg7Var5;
                            } catch (Throwable th8) {
                                th = th8;
                                z3 = false;
                                try {
                                    di4Var2.f = z3;
                                    throw th;
                                } catch (Throwable th9) {
                                    th = th9;
                                    reentrantLock = reentrantLock2;
                                    reentrantLock.unlock();
                                    throw th;
                                }
                            }
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d97Var = (d97) this.Z;
                    oi2.Y(obj);
                    bool = obj;
                } else {
                    oi2.Y(obj);
                    d97Var = (d97) this.Z;
                    this.Z = d97Var;
                    this.Y = 1;
                    Boolean c = d97Var.c(this);
                    bool = c;
                    break;
                }
                if (!((Boolean) bool).booleanValue()) {
                    nc7 nc7Var = (nc7) this.e0;
                    di4Var = nc7Var.h;
                    reentrantLock = di4Var.e;
                    reentrantLock.lock();
                    try {
                        di4Var.f = true;
                        ReentrantLock reentrantLock3 = di4Var.a;
                        reentrantLock3.lock();
                        if (di4Var.d) {
                            di4Var.d = false;
                            int length = di4Var.b.length;
                            ci4VarArr = new ci4[length];
                            int i19 = 0;
                            boolean z5 = false;
                            while (i19 < length) {
                                if (di4Var.b[i19] > 0) {
                                    z2 = true;
                                } else {
                                    z2 = z4;
                                }
                                boolean[] zArr = di4Var.c;
                                if (z2 != zArr[i19]) {
                                    zArr[i19] = z2;
                                    if (z2) {
                                        ci4Var = ci4.ADD;
                                    } else {
                                        ci4Var = ci4.REMOVE;
                                    }
                                    z5 = true;
                                } else {
                                    ci4Var = ci4.NO_OP;
                                }
                                ci4VarArr[i19] = ci4Var;
                                i19++;
                                z4 = false;
                            }
                            break;
                        }
                        ci4VarArr = null;
                        reentrantLock3.unlock();
                        if (ci4VarArr != null) {
                            try {
                                if (ci4VarArr.length != 0) {
                                    c97 c97Var = c97.IMMEDIATE;
                                    mc7 mc7Var = new mc7(ci4VarArr, nc7Var, d97Var, null);
                                    this.Z = di4Var;
                                    this.d0 = reentrantLock;
                                    this.Y = 2;
                                    if (d97Var.a(c97Var, mc7Var, this) != x61Var17) {
                                        di4Var2 = di4Var;
                                        reentrantLock2 = reentrantLock;
                                        reentrantLock = reentrantLock2;
                                        di4Var = di4Var2;
                                    }
                                    return x61Var17;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                di4Var2 = di4Var;
                                reentrantLock2 = reentrantLock;
                                z3 = false;
                                di4Var2.f = z3;
                                throw th;
                            }
                        }
                        di4Var.f = false;
                        reentrantLock.unlock();
                    } catch (Throwable th11) {
                        th = th11;
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                return jg7Var5;
            case 17:
                qh7 qh7Var = (qh7) this.d0;
                mm1 mm1Var = (mm1) this.Z;
                x61 x61Var18 = x61.COROUTINE_SUSPENDED;
                int i20 = this.Y;
                if (i20 != 0) {
                    if (i20 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    v80 v80Var = qh7Var.f;
                    this.Z = mm1Var;
                    this.Y = 1;
                    if (v80Var.a(this, mm1Var) == x61Var18) {
                        return x61Var18;
                    }
                }
                if (mm1Var instanceof jm1) {
                    qh7Var.b.getClass();
                    ((kt) this.e0).getClass();
                }
                return jg7.a;
            case 18:
                j97 j97Var = (j97) this.d0;
                x61 x61Var19 = x61.COROUTINE_SUSPENDED;
                int i21 = this.Y;
                if (i21 != 0) {
                    if (i21 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    final r35 r35Var = (r35) this.Z;
                    b31 b31Var = new b31() { // from class: st7
                        @Override // defpackage.b31
                        public final void accept(Object obj2) {
                            int i22 = r2;
                            r35 r35Var2 = r35Var;
                            kv7 kv7Var = (kv7) obj2;
                            switch (i22) {
                                case 0:
                                    r35Var2.c(kv7Var);
                                    return;
                                default:
                                    r35Var2.c(kv7Var);
                                    return;
                            }
                        }
                    };
                    ((gt7) j97Var.B).b((Context) this.e0, new yt(1), b31Var);
                    yu6 yu6Var = new yu6(7, j97Var, b31Var);
                    this.Y = 1;
                    if (kj2.q(r35Var, yu6Var, this) == x61Var19) {
                        return x61Var19;
                    }
                }
                return jg7.a;
            case 19:
                j97 j97Var2 = (j97) this.d0;
                x61 x61Var20 = x61.COROUTINE_SUSPENDED;
                int i22 = this.Y;
                if (i22 != 0) {
                    if (i22 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    final r35 r35Var2 = (r35) this.Z;
                    b31 b31Var2 = new b31() { // from class: st7
                        @Override // defpackage.b31
                        public final void accept(Object obj2) {
                            int i222 = r2;
                            r35 r35Var22 = r35Var2;
                            kv7 kv7Var = (kv7) obj2;
                            switch (i222) {
                                case 0:
                                    r35Var22.c(kv7Var);
                                    return;
                                default:
                                    r35Var22.c(kv7Var);
                                    return;
                            }
                        }
                    };
                    ((gt7) j97Var2.B).b((Activity) this.e0, new yt(1), b31Var2);
                    yu6 yu6Var2 = new yu6(8, j97Var2, b31Var2);
                    this.Y = 1;
                    if (kj2.q(r35Var2, yu6Var2, this) == x61Var20) {
                        return x61Var20;
                    }
                }
                return jg7.a;
            case 20:
                yw7 yw7Var = (yw7) this.d0;
                x61 x61Var21 = x61.COROUTINE_SUSPENDED;
                int i23 = this.Y;
                if (i23 != 0) {
                    if (i23 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    le2 s = ((ww2) this.Z).s(yw7Var);
                    zb0 zb0Var2 = new zb0(20, (ll4) this.e0, yw7Var);
                    this.Y = 1;
                    if (s.b(zb0Var2, this) == x61Var21) {
                        return x61Var21;
                    }
                }
                return jg7.a;
            default:
                nx3 nx3Var = (nx3) this.d0;
                rx7 rx7Var = (rx7) this.Z;
                yw7 yw7Var2 = rx7Var.a;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                int i24 = this.Y;
                if (i24 != 0) {
                    if (i24 != 1) {
                        if (i24 == 2) {
                            oi2.Y(obj);
                            return obj;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    Context context = rx7Var.b;
                    fw7 fw7Var = (fw7) this.e0;
                    ow7 ow7Var = rx7Var.d;
                    this.Y = 1;
                    String str2 = ew7.a;
                    Object obj3 = jg7.a;
                    if (yw7Var2.q && Build.VERSION.SDK_INT < 31) {
                        ec3 ec3Var = ow7Var.d;
                        ec3Var.getClass();
                        Object d02 = hv.d0(f04.F(ec3Var), new kp5(nx3Var, yw7Var2, fw7Var, context, null, 12), this);
                        if (d02 == obj2) {
                            obj3 = d02;
                            break;
                        }
                    }
                }
                String str3 = sx7.a;
                ga0.f().b(str3, "Starting work for " + yw7Var2.c);
                tb0 d = nx3Var.d();
                this.Y = 2;
                Object a2 = sx7.a(d, nx3Var, this);
                if (a2 != obj2) {
                    return a2;
                }
                return obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vy5(Object obj, Object obj2, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.d0 = obj;
        this.e0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vy5(Object obj, Object obj2, Object obj3, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = obj;
        this.d0 = obj2;
        this.e0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vy5(Object obj, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.e0 = obj;
    }
}
