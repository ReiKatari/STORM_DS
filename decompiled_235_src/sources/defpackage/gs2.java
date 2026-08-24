package defpackage;

import android.app.DownloadManager;
import android.content.Intent;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gs2  reason: default package */
/* loaded from: classes.dex */
public final class gs2 extends ContentObserver {
    public final /* synthetic */ DownloadManager a;
    public final /* synthetic */ long b;
    public final /* synthetic */ r35 c;
    public final /* synthetic */ hs2 d;
    public final /* synthetic */ kt e;
    public final /* synthetic */ File f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs2(DownloadManager downloadManager, long j, r35 r35Var, hs2 hs2Var, kt ktVar, File file) {
        super(null);
        this.a = downloadManager;
        this.b = j;
        this.c = r35Var;
        this.d = hs2Var;
        this.e = ktVar;
        this.f = file;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        DownloadManager.Query query = new DownloadManager.Query();
        long j = this.b;
        DownloadManager.Query filterById = query.setFilterById(j);
        DownloadManager downloadManager = this.a;
        Cursor query2 = downloadManager.query(filterById);
        hs2 hs2Var = this.d;
        kt ktVar = this.e;
        File file = this.f;
        try {
            if (!query2.moveToNext()) {
                query2.close();
                return;
            }
            long j2 = query2.getLong(query2.getColumnIndexOrThrow("total_size"));
            long j3 = query2.getLong(query2.getColumnIndexOrThrow("bytes_so_far"));
            int i = query2.getInt(query2.getColumnIndexOrThrow("status"));
            int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            r35 r35Var = this.c;
            if (i2 >= 0) {
                r35Var.getClass();
                r35Var.c(new lm1(j2, j3));
            }
            km1 km1Var = km1.a;
            if (i != 8) {
                if (i == 16) {
                    r35Var.getClass();
                    r35Var.c(km1Var);
                    r35Var.w0(null);
                }
            } else {
                if (hs2Var.c(ktVar, file)) {
                    Uri uriForDownloadedFile = downloadManager.getUriForDownloadedFile(j);
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(uriForDownloadedFile, "application/vnd.android.package-archive");
                    intent.setFlags(268435457);
                    hs2Var.a.startActivity(intent);
                    r35Var.getClass();
                    r35Var.c(jm1.a);
                } else {
                    r35Var.getClass();
                    r35Var.c(km1Var);
                }
                r35Var.getClass();
                r35Var.w0(null);
            }
            query2.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ge7.t(query2, th);
                throw th2;
            }
        }
    }
}
