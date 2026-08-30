package defpackage;

import android.app.DownloadManager;
import android.content.Intent;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bm2  reason: default package */
/* loaded from: classes.dex */
public final class bm2 extends ContentObserver {
    public final /* synthetic */ DownloadManager a;
    public final /* synthetic */ long b;
    public final /* synthetic */ nu4 c;
    public final /* synthetic */ cm2 d;
    public final /* synthetic */ us e;
    public final /* synthetic */ File f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm2(DownloadManager downloadManager, long j, nu4 nu4Var, cm2 cm2Var, us usVar, File file) {
        super(null);
        this.a = downloadManager;
        this.b = j;
        this.c = nu4Var;
        this.d = cm2Var;
        this.e = usVar;
        this.f = file;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        DownloadManager.Query query = new DownloadManager.Query();
        long j = this.b;
        DownloadManager.Query filterById = query.setFilterById(j);
        DownloadManager downloadManager = this.a;
        Cursor query2 = downloadManager.query(filterById);
        cm2 cm2Var = this.d;
        us usVar = this.e;
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
            nu4 nu4Var = this.c;
            if (i2 >= 0) {
                nu4Var.getClass();
                nu4Var.c(new gi1(j2, j3));
            }
            fi1 fi1Var = fi1.a;
            if (i != 8) {
                if (i == 16) {
                    nu4Var.getClass();
                    nu4Var.c(fi1Var);
                    nu4Var.w0(null);
                }
            } else {
                if (cm2Var.c(usVar, file)) {
                    Uri uriForDownloadedFile = downloadManager.getUriForDownloadedFile(j);
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(uriForDownloadedFile, "application/vnd.android.package-archive");
                    intent.setFlags(268435457);
                    cm2Var.a.startActivity(intent);
                    nu4Var.getClass();
                    nu4Var.c(ei1.a);
                } else {
                    nu4Var.getClass();
                    nu4Var.c(fi1Var);
                }
                nu4Var.getClass();
                nu4Var.w0(null);
            }
            query2.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                dt3.W(query2, th);
                throw th2;
            }
        }
    }
}
