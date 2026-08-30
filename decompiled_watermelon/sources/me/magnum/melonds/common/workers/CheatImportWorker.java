package me.magnum.melonds.common.workers;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class CheatImportWorker extends CoroutineWorker {
    public final xm0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheatImportWorker(Context context, WorkerParameters workerParameters, xm0 xm0Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        xm0Var.getClass();
        this.g = xm0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r12 == r2) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Type inference failed for: r0v6, types: [ij7, java.lang.Object] */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.j11 r12) {
        /*
            r11 = this;
            android.content.Context r0 = r11.a
            boolean r1 = r12 instanceof defpackage.sl0
            if (r1 == 0) goto L15
            r1 = r12
            sl0 r1 = (defpackage.sl0) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Y = r2
            goto L1c
        L15:
            sl0 r1 = new sl0
            k11 r12 = (defpackage.k11) r12
            r1.<init>(r11, r12)
        L1c:
            java.lang.Object r12 = r1.R
            p31 r2 = defpackage.p31.COROUTINE_SUSPENDED
            int r3 = r1.Y
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L39
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2f
            defpackage.me2.a0(r12)     // Catch: java.lang.Exception -> Lc8
            return r12
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r11)
            return r6
        L35:
            defpackage.me2.a0(r12)
            goto L53
        L39:
            defpackage.me2.a0(r12)
            r12 = 0
            xe2 r12 = r11.g(r6, r12, r5)
            r1.Y = r5
            fq3 r12 = r11.b(r12)
            java.lang.Object r12 = defpackage.ep2.j(r12, r1)
            if (r12 != r2) goto L4e
            goto L50
        L4e:
            o27 r12 = defpackage.o27.a
        L50:
            if (r12 != r2) goto L53
            goto Lba
        L53:
            androidx.work.WorkerParameters r12 = r11.b
            g81 r12 = r12.b
            java.lang.String r3 = "uri"
            java.lang.String r12 = r12.b(r3)
            if (r12 == 0) goto Lce
            android.net.Uri r12 = android.net.Uri.parse(r12)
            if (r12 != 0) goto L66
            goto Lce
        L66:
            c76 r3 = defpackage.uh1.g(r0, r12)     // Catch: java.lang.Exception -> Lc8
            boolean r7 = r3.l()     // Catch: java.lang.Exception -> Lc8
            if (r7 != r5) goto Lc2
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> Lc8
            java.lang.String r5 = "r"
            android.content.res.AssetFileDescriptor r0 = r0.openAssetFileDescriptor(r12, r5)     // Catch: java.lang.Exception -> Lc8
            if (r0 == 0) goto L98
            long r7 = r0.getLength()     // Catch: java.lang.Throwable -> L91
            r9 = -1
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 != 0) goto L88
            r5 = r6
            goto L8d
        L88:
            java.lang.Long r5 = new java.lang.Long     // Catch: java.lang.Throwable -> L91
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L91
        L8d:
            r0.close()     // Catch: java.lang.Exception -> Lc8
            goto L99
        L91:
            r11 = move-exception
            throw r11     // Catch: java.lang.Throwable -> L93
        L93:
            r12 = move-exception
            defpackage.dt3.W(r0, r11)     // Catch: java.lang.Exception -> Lc8
            throw r12     // Catch: java.lang.Exception -> Lc8
        L98:
            r5 = r6
        L99:
            java.lang.String r0 = r3.i()     // Catch: java.lang.Exception -> Lc8
            if (r0 == 0) goto La5
            r3 = 46
            java.lang.String r6 = defpackage.zg6.U0(r3, r0, r0)     // Catch: java.lang.Exception -> Lc8
        La5:
            java.lang.String r0 = "xml"
            boolean r0 = defpackage.b53.x(r6, r0)     // Catch: java.lang.Exception -> Lc8
            if (r0 == 0) goto Lbc
            ij7 r0 = new ij7     // Catch: java.lang.Exception -> Lc8
            r0.<init>()     // Catch: java.lang.Exception -> Lc8
            r1.Y = r4     // Catch: java.lang.Exception -> Lc8
            java.lang.Object r11 = r11.h(r12, r0, r5, r1)     // Catch: java.lang.Exception -> Lc8
            if (r11 != r2) goto Lbb
        Lba:
            return r2
        Lbb:
            return r11
        Lbc:
            iq3 r11 = new iq3     // Catch: java.lang.Exception -> Lc8
            r11.<init>()     // Catch: java.lang.Exception -> Lc8
            return r11
        Lc2:
            iq3 r11 = new iq3     // Catch: java.lang.Exception -> Lc8
            r11.<init>()     // Catch: java.lang.Exception -> Lc8
            return r11
        Lc8:
            iq3 r11 = new iq3
            r11.<init>()
            return r11
        Lce:
            iq3 r11 = new iq3
            r11.<init>()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.common.workers.CheatImportWorker.e(j11):java.lang.Object");
    }

    public final xe2 g(String str, int i, boolean z) {
        Context context = this.a;
        f84 f84Var = new f84(context);
        f84Var.g = -1;
        f84Var.i = f84.b(context.getString(R.string.importing_cheats));
        if (str == null) {
            str = "";
        }
        f84Var.e = f84.b(str);
        f84Var.n = context.getColor(R.color.melonMain);
        f84Var.q.icon = R.drawable.ic_melon_small;
        f84Var.j = 100;
        f84Var.k = i;
        f84Var.l = z;
        Notification a = f84Var.a();
        a.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            return new xe2(100, a, 1);
        }
        return new xe2(100, a, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(android.net.Uri r9, defpackage.ij7 r10, java.lang.Long r11, defpackage.k11 r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.tl0
            if (r0 == 0) goto L13
            r0 = r12
            tl0 r0 = (defpackage.tl0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            tl0 r0 = new tl0
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.me2.a0(r12)
            goto L85
        L27:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r8)
            r8 = 0
            return r8
        L2e:
            defpackage.me2.a0(r12)
            r0.Y = r3
            rs5 r6 = new rs5
            j11 r12 = defpackage.nk2.J(r0)
            p31 r0 = defpackage.p31.UNDECIDED
            r6.<init>(r12, r0)
            android.content.Context r12 = r8.a
            android.content.ContentResolver r12 = r12.getContentResolver()
            java.io.InputStream r9 = r12.openInputStream(r9)
            if (r9 == 0) goto L7e
            zu4 r5 = new zu4     // Catch: java.lang.Throwable -> L75
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L75
            q9 r2 = new q9     // Catch: java.lang.Throwable -> L75
            r7 = 6
            r3 = r8
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L75
            r10.getClass()     // Catch: java.lang.Throwable -> L75
            javax.xml.parsers.SAXParserFactory r8 = javax.xml.parsers.SAXParserFactory.newInstance()     // Catch: java.lang.Throwable -> L75
            javax.xml.parsers.SAXParser r8 = r8.newSAXParser()     // Catch: java.lang.Throwable -> L75
            jj7 r10 = new jj7     // Catch: java.lang.Throwable -> L75
            u57 r11 = new u57     // Catch: java.lang.Throwable -> L75
            r12 = 12
            r11.<init>(r12, r2)     // Catch: java.lang.Throwable -> L75
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L75
            r8.parse(r5, r10)     // Catch: java.lang.Throwable -> L75
            r9.close()
            goto L7e
        L75:
            r0 = move-exception
            r8 = r0
            throw r8     // Catch: java.lang.Throwable -> L78
        L78:
            r0 = move-exception
            r10 = r0
            defpackage.dt3.W(r9, r8)
            throw r10
        L7e:
            java.lang.Object r12 = r6.b()
            if (r12 != r1) goto L85
            return r1
        L85:
            r12.getClass()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.common.workers.CheatImportWorker.h(android.net.Uri, ij7, java.lang.Long, k11):java.lang.Object");
    }
}
