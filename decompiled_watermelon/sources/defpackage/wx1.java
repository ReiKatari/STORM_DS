package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import java.util.List;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
import me.magnum.melonds.ui.romlist.a;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wx1  reason: default package */
/* loaded from: classes.dex */
public final class wx1 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public Object Z;
    public Object c0;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wx1(hv1 hv1Var, Object obj, Object obj2, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = hv1Var;
        this.c0 = obj;
        this.d0 = obj2;
    }

    private final Object A(Object obj) {
        gl5 gl5Var = (gl5) this.Z;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.Y;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
            } else {
                i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            int tabIndex = gl5Var.getTabIndex();
            this.Y = 1;
            if (ki4.g((ya1) this.c0, tabIndex, this) == p31Var) {
                return p31Var;
            }
        }
        wc2.a((wc2) ((List) this.d0).get(gl5Var.getTabIndex()));
        return o27.a;
    }

    private final Object B(Object obj) {
        k24 k24Var;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.Y;
        if (i != 0) {
            if (i == 1) {
                k24Var = (k24) this.c0;
                me2.a0(obj);
            } else {
                i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            k24 k24Var2 = (k24) this.d0;
            this.c0 = k24Var2;
            this.Y = 1;
            Object n = ((mi2) this.Z).n(this);
            if (n == p31Var) {
                return p31Var;
            }
            obj = n;
            k24Var = k24Var2;
        }
        mh4 mh4Var = an5.a;
        k24Var.setValue((tm5) obj);
        return o27.a;
    }

    private final Object C(Object obj) {
        Object kc5Var;
        Object kc5Var2;
        a aVar = (a) this.Z;
        o31 o31Var = (o31) this.c0;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.Y;
        try {
            if (i != 0) {
                if (i == 1) {
                    me2.a0(obj);
                } else {
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                me2.a0(obj);
                rg5 rg5Var = (rg5) this.d0;
                bb1 bb1Var = tg1.a;
                ha1 ha1Var = ha1.L;
                n5 n5Var = new n5(aVar, rg5Var, (j11) null, 28);
                this.c0 = o31Var;
                this.Y = 1;
                obj = tq5.G(ha1Var, n5Var, this);
                if (obj == p31Var) {
                    return p31Var;
                }
            }
            kc5Var = (qp5) obj;
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        Throwable a = nc5.a(kc5Var);
        o27 o27Var = o27.a;
        if (a == null) {
            qp5 qp5Var = (qp5) kc5Var;
            if (qp5Var == null) {
                Toast.makeText(aVar.requireContext(), (int) R.string.rom_save_file_missing, 1).show();
                return o27Var;
            }
            String str = qp5Var.b;
            Uri uri = qp5Var.a;
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("*/*");
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.putExtra("android.intent.extra.TITLE", str);
            intent.addFlags(1);
            intent.setClipData(ClipData.newUri(aVar.requireContext().getContentResolver(), str, uri));
            try {
                aVar.startActivity(Intent.createChooser(intent, aVar.getString(R.string.rom_save_file_share_chooser)));
                kc5Var2 = o27Var;
            } catch (Throwable th2) {
                kc5Var2 = new kc5(th2);
            }
            if (nc5.a(kc5Var2) != null) {
                Toast.makeText(aVar.requireContext(), (int) R.string.rom_save_file_share_failed, 1).show();
            }
            return o27Var;
        }
        Toast.makeText(aVar.requireContext(), (int) R.string.rom_save_file_share_failed, 1).show();
        return o27Var;
    }

    private final Object D(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.Y;
        o27 o27Var = o27.a;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
                return o27Var;
            }
            i.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        me2.a0(obj);
        yo5 yo5Var = (yo5) this.d0;
        u92[] u92VarArr = {(u92) this.c0, (u92) this.Z, yo5Var.D, yo5Var.C, yo5Var.p, yo5Var.q};
        go5 go5Var = new go5(yo5Var, 2);
        this.Y = 1;
        Object G = n40.G(this, go5Var, new xy1(u92VarArr, 1), new jo5(null, yo5Var), u92VarArr);
        if (G != p31Var) {
            G = o27Var;
        }
        if (G == p31Var) {
            return p31Var;
        }
        return o27Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object E(java.lang.Object r5) {
        /*
            r4 = this;
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r4.Y
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L13
            java.lang.Object r4 = r4.c0
            gs0 r4 = (defpackage.gs0) r4
            defpackage.me2.a0(r5)     // Catch: java.lang.Throwable -> L11
            goto L3e
        L11:
            r5 = move-exception
            goto L38
        L13:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L1a:
            defpackage.me2.a0(r5)
            java.lang.Object r5 = r4.c0
            o31 r5 = (defpackage.o31) r5
            java.lang.Object r1 = r4.Z
            gs0 r1 = (defpackage.gs0) r1
            java.lang.Object r3 = r4.d0
            aj2 r3 = (defpackage.aj2) r3
            r4.c0 = r1     // Catch: java.lang.Throwable -> L36
            r4.Y = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r5 = r3.j(r5, r4)     // Catch: java.lang.Throwable -> L36
            if (r5 != r0) goto L34
            return r0
        L34:
            r4 = r1
            goto L3e
        L36:
            r5 = move-exception
            r4 = r1
        L38:
            kc5 r0 = new kc5
            r0.<init>(r5)
            r5 = r0
        L3e:
            java.lang.Throwable r0 = defpackage.nc5.a(r5)
            if (r0 != 0) goto L48
            r4.c0(r5)
            goto L4b
        L48:
            r4.v0(r0)
        L4b:
            o27 r4 = defpackage.o27.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx1.E(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[Catch: all -> 0x0020, CancellationException -> 0x00be, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00be, all -> 0x0020, blocks: (B:6:0x001c, B:15:0x003c, B:17:0x005e, B:18:0x006c), top: B:37:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0076 -> B:21:0x0079). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.d0
            ka r0 = (defpackage.ka) r0
            java.lang.Object r1 = r0.Z
            xt r1 = (defpackage.xt) r1
            p31 r2 = defpackage.p31.COROUTINE_SUSPENDED
            int r3 = r11.Y
            r4 = 1
            java.lang.String r5 = "CXCP"
            r6 = 0
            if (r3 == 0) goto L29
            if (r3 != r4) goto L23
            java.lang.Object r3 = r11.Z
            n75 r3 = (defpackage.n75) r3
            java.lang.Object r7 = r11.c0
            o31 r7 = (defpackage.o31) r7
            defpackage.me2.a0(r12)     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbe
            goto L79
        L20:
            r11 = move-exception
            goto Lb8
        L23:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r11)
            return r6
        L29:
            defpackage.me2.a0(r12)
            java.lang.Object r12 = r11.c0
            o31 r12 = (defpackage.o31) r12
            n75 r3 = new n75
            r3.<init>()
            r7 = r12
        L36:
            boolean r12 = defpackage.iq2.t(r7)
            if (r12 == 0) goto Laf
            jy5 r12 = new jy5     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbe
            e31 r8 = r11.B     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbe
            r8.getClass()     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbe
            r12.<init>(r8)     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbe
            java.lang.Object r8 = r0.Y     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbe
            q60 r8 = (defpackage.q60) r8     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbe
            q9 r8 = r8.w()     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbe
            n5 r9 = new n5     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbe
            r10 = 20
            r9.<init>(r0, r6, r10)     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbe
            r12.h(r8, r9)     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbe
            java.lang.Object r8 = r3.A     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbe
            ic1 r8 = (defpackage.ic1) r8     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbe
            if (r8 == 0) goto L6c
            q9 r8 = r8.x()     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbe
            x3 r9 = new x3     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbe
            r10 = 12
            r9.<init>(r3, r6, r10)     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbe
            r12.h(r8, r9)     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbe
        L6c:
            r11.c0 = r7     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbe
            r11.Z = r3     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbe
            r11.Y = r4     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbe
            java.lang.Object r12 = r12.e(r11)     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbe
            if (r12 != r2) goto L79
            return r2
        L79:
            boolean r12 = r1.isEmpty()
            if (r12 != 0) goto L36
            java.lang.Object r12 = r3.A
            if (r12 == 0) goto L84
            goto L36
        L84:
            java.lang.Object r12 = r1.first()
            v74 r8 = new v74
            r9 = 7
            r8.<init>(r0, r12, r6, r9)
            r9 = 3
            jc1 r8 = defpackage.tq5.e(r7, r6, r6, r8, r9)
            boolean r9 = r8.isCancelled()
            if (r9 == 0) goto Lb1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to process "
            r11.<init>(r1)
            r11.append(r12)
            java.lang.String r12 = " due to Job cancellation"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            android.util.Log.i(r5, r11)
        Laf:
            r11 = r6
            goto Lc4
        Lb1:
            r1.removeFirst()
            r3.A = r8
            goto L36
        Lb8:
            java.lang.String r12 = "Encountered exception during processing"
            android.util.Log.e(r5, r12, r11)
            goto Lc4
        Lbe:
            java.lang.String r11 = "PruningProcessingQueue: Scope cancelled"
            android.util.Log.d(r5, r11)
            goto Laf
        Lc4:
            defpackage.ka.a(r0, r11)
            if (r11 != 0) goto Lca
            return r6
        Lca:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx1.x(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (defpackage.ki3.j((defpackage.ki3) r5.c0, 0, r5) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (defpackage.pk3.l((defpackage.pk3) r5.Z, 0, r5) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object y(java.lang.Object r6) {
        /*
            r5 = this;
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r5.Y
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1c
            if (r1 == r4) goto L18
            if (r1 != r3) goto L11
            defpackage.me2.a0(r6)
            goto L41
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            r5 = 0
            return r5
        L18:
            defpackage.me2.a0(r6)
            goto L34
        L1c:
            defpackage.me2.a0(r6)
            java.lang.Object r6 = r5.d0
            qj4 r6 = (defpackage.qj4) r6
            r1 = -1
            r6.i(r1)
            java.lang.Object r6 = r5.c0
            ki3 r6 = (defpackage.ki3) r6
            r5.Y = r4
            java.lang.Object r6 = defpackage.ki3.j(r6, r2, r5)
            if (r6 != r0) goto L34
            goto L40
        L34:
            java.lang.Object r6 = r5.Z
            pk3 r6 = (defpackage.pk3) r6
            r5.Y = r3
            java.lang.Object r5 = defpackage.pk3.l(r6, r2, r5)
            if (r5 != r0) goto L41
        L40:
            return r0
        L41:
            o27 r5 = defpackage.o27.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx1.y(java.lang.Object):java.lang.Object");
    }

    private final Object z(Object obj) {
        Object kc5Var;
        Object kc5Var2;
        RomDetailsActivity romDetailsActivity = (RomDetailsActivity) this.Z;
        o31 o31Var = (o31) this.c0;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.Y;
        try {
            if (i != 0) {
                if (i == 1) {
                    me2.a0(obj);
                } else {
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                me2.a0(obj);
                rg5 rg5Var = (rg5) this.d0;
                bb1 bb1Var = tg1.a;
                ha1 ha1Var = ha1.L;
                n5 n5Var = new n5(romDetailsActivity, rg5Var, (j11) null, 25);
                this.c0 = o31Var;
                this.Y = 1;
                obj = tq5.G(ha1Var, n5Var, this);
                if (obj == p31Var) {
                    return p31Var;
                }
            }
            kc5Var = (qp5) obj;
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        Throwable a = nc5.a(kc5Var);
        o27 o27Var = o27.a;
        if (a == null) {
            qp5 qp5Var = (qp5) kc5Var;
            if (qp5Var == null) {
                Toast.makeText(romDetailsActivity, (int) R.string.rom_save_file_missing, 1).show();
                return o27Var;
            }
            String str = qp5Var.b;
            Uri uri = qp5Var.a;
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("*/*");
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.putExtra("android.intent.extra.TITLE", str);
            intent.addFlags(1);
            intent.setClipData(ClipData.newUri(romDetailsActivity.getContentResolver(), str, uri));
            try {
                romDetailsActivity.startActivity(Intent.createChooser(intent, romDetailsActivity.getString(R.string.rom_save_file_share_chooser)));
                kc5Var2 = o27Var;
            } catch (Throwable th2) {
                kc5Var2 = new kc5(th2);
            }
            if (nc5.a(kc5Var2) != null) {
                Toast.makeText(romDetailsActivity, (int) R.string.rom_save_file_share_failed, 1).show();
            }
            return o27Var;
        }
        Toast.makeText(romDetailsActivity, (int) R.string.rom_save_file_share_failed, 1).show();
        return o27Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 1:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 2:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 3:
                return ((wx1) t((j11) obj2, (List) obj)).v(o27Var);
            case 4:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 5:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            case ig7.b /* 6 */:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 7:
                return ((wx1) t((j11) obj2, (w92) obj)).v(o27Var);
            case 8:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 9:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 10:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 11:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            case mj2.L /* 12 */:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 13:
                return ((wx1) t((j11) obj2, (w92) obj)).v(o27Var);
            case 14:
                return ((wx1) t((j11) obj2, (nu4) obj)).v(o27Var);
            case ig7.e /* 15 */:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 16:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 17:
                return ((wx1) t((j11) obj2, (List) obj)).v(o27Var);
            case 18:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 19:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 20:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 21:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 22:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 23:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 24:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 25:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 26:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 27:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 28:
                return ((wx1) t((j11) obj2, (o31) obj)).v(o27Var);
            default:
                return ((wx1) t((j11) obj2, (xw5) obj)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Object obj2 = this.d0;
        switch (i) {
            case 0:
                return new wx1((hv1) this.Z, (hz4) obj2, j11Var, 0);
            case 1:
                return new wx1((hv1) this.Z, (Object) ((z15) this.c0), (Object) ((st1) obj2), j11Var, 1);
            case 2:
                return new wx1((hv1) this.Z, (Object) ((nz4) this.c0), (Object) ((tl3) obj2), j11Var, 2);
            case 3:
                wx1 wx1Var = new wx1((hv1) this.Z, (jm4) obj2, j11Var, 3);
                wx1Var.c0 = obj;
                return wx1Var;
            case 4:
                return new wx1((hv1) this.c0, (rg5) obj2, j11Var);
            case 5:
                wx1 wx1Var2 = new wx1((bj2) this.Z, (w92) obj2, j11Var, 5);
                wx1Var2.c0 = obj;
                return wx1Var2;
            case ig7.b /* 6 */:
                return new wx1((l14) this.c0, (l33) this.Z, (eh1) obj2, j11Var, 6);
            case 7:
                wx1 wx1Var3 = new wx1((cm2) this.Z, (us) obj2, j11Var, 7);
                wx1Var3.c0 = obj;
                return wx1Var3;
            case 8:
                return new wx1((q60) obj2, j11Var, 8);
            case 9:
                return new wx1((z33) obj2, j11Var, 9);
            case 10:
                return new wx1((k43) obj2, j11Var, 10);
            case 11:
                wx1 wx1Var4 = new wx1((aj2) this.Z, (i90) obj2, j11Var, 11);
                wx1Var4.c0 = obj;
                return wx1Var4;
            case mj2.L /* 12 */:
                return new wx1((by5) this.c0, (k24) this.Z, (pj4) obj2, j11Var, 12);
            case 13:
                wx1 wx1Var5 = new wx1((Context) obj2, j11Var, 13);
                wx1Var5.c0 = obj;
                return wx1Var5;
            case 14:
                wx1 wx1Var6 = new wx1((kz0) this.Z, (n64) obj2, j11Var, 14);
                wx1Var6.c0 = obj;
                return wx1Var6;
            case ig7.e /* 15 */:
                return new wx1((ra4) this.c0, (String) this.Z, (String) obj2, j11Var, 15);
            case 16:
                return new wx1((ki2) this.c0, (k24) this.Z, (k24) obj2, j11Var, 16);
            case 17:
                wx1 wx1Var7 = new wx1((wn4) this.Z, (j75) obj2, j11Var, 17);
                wx1Var7.c0 = obj;
                return wx1Var7;
            case 18:
                return new wx1((n75) this.Z, (eq4) obj2, j11Var, 18);
            case 19:
                wx1 wx1Var8 = new wx1((ka) obj2, j11Var, 19);
                wx1Var8.c0 = obj;
                return wx1Var8;
            case 20:
                wx1 wx1Var9 = new wx1((r55) this.Z, (im) obj2, j11Var, 20);
                wx1Var9.c0 = obj;
                return wx1Var9;
            case 21:
                return new wx1((xd5) this.c0, (String) this.Z, (String) obj2, j11Var, 21);
            case 22:
                return new wx1((ki3) this.c0, (pk3) this.Z, (qj4) obj2, j11Var, 22);
            case 23:
                wx1 wx1Var10 = new wx1((RomDetailsActivity) this.Z, (rg5) obj2, j11Var, 23);
                wx1Var10.c0 = obj;
                return wx1Var10;
            case 24:
                return new wx1((ya1) this.c0, (gl5) this.Z, (List) obj2, j11Var, 24);
            case 25:
                return new wx1((mi2) this.Z, (k24) obj2, j11Var, 25);
            case 26:
                wx1 wx1Var11 = new wx1((a) this.Z, (rg5) obj2, j11Var, 26);
                wx1Var11.c0 = obj;
                return wx1Var11;
            case 27:
                return new wx1((u92) this.c0, (u92) this.Z, (yo5) obj2, j11Var, 27);
            case 28:
                wx1 wx1Var12 = new wx1((gs0) this.Z, (aj2) obj2, j11Var, 28);
                wx1Var12.c0 = obj;
                return wx1Var12;
            default:
                wx1 wx1Var13 = new wx1((rj1) this.Z, (ax5) obj2, j11Var, 29);
                wx1Var13.c0 = obj;
                return wx1Var13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x0423, code lost:
        if (r4.b(r3, r19) == r5) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0426, code lost:
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0434, code lost:
        if (r4.b(r3, r19) == r5) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0443, code lost:
        if (r4.b(r3, r19) == r5) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x045b, code lost:
        if (r3.a(r4, r19) != r5) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x045e, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0709, code lost:
        if (r5.b(r3, r19) == r11) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x070b, code lost:
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0729, code lost:
        if (r5.b(r3, r19) == r11) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x07e4, code lost:
        if (r3.a(r5, r19) == r0) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x07f8, code lost:
        if (r5.b(r3, r19) == r0) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b2, code lost:
        if (r5 == r4) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0891, code lost:
        if (r4 == r2) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x08aa, code lost:
        if (r1 == r2) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x08ad, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bf, code lost:
        if (defpackage.xd5.e(r2, r19) == r4) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x097a, code lost:
        if (r4 == r3) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c8, code lost:
        if (defpackage.xd5.e(r2, r19) == r4) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x099b, code lost:
        if (r2.b(r6, r19) == r3) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:?, code lost:
        return r3;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x066f A[Catch: all -> 0x0643, TryCatch #2 {all -> 0x0643, blocks: (B:313:0x063d, B:323:0x0667, B:325:0x066f, B:326:0x067c, B:333:0x068c, B:320:0x0659, B:335:0x068f, B:319:0x0654, B:327:0x067d, B:329:0x0683), top: B:476:0x0631 }] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0696  */
    /* JADX WARN: Type inference failed for: r10v30, types: [j75, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v113 */
    /* JADX WARN: Type inference failed for: r3v114 */
    /* JADX WARN: Type inference failed for: r3v29, types: [lj0] */
    /* JADX WARN: Type inference failed for: r3v31, types: [q60] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v33, types: [lj0] */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.util.Iterator] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:321:0x0663 -> B:323:0x0667). Please submit an issue!!! */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx1.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx1(hv1 hv1Var, rg5 rg5Var, j11 j11Var) {
        super(2, j11Var);
        this.X = 4;
        this.c0 = hv1Var;
        this.d0 = rg5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wx1(Object obj, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.d0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wx1(Object obj, Object obj2, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = obj;
        this.d0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wx1(Object obj, Object obj2, Object obj3, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.c0 = obj;
        this.Z = obj2;
        this.d0 = obj3;
    }
}
