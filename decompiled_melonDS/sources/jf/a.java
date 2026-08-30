package jf;

import android.app.DownloadManager;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import bd.v;
import oe.k;
import oe.l;
import oe.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DownloadManager f7863a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v f7864b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f7865c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DownloadManager downloadManager, v vVar, long j2) {
        super(null);
        this.f7863a = downloadManager;
        this.f7864b = vVar;
        this.f7865c = j2;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10, Uri uri) {
        DownloadManager.Query query = new DownloadManager.Query();
        boolean z11 = true;
        query.setFilterById(this.f7865c);
        Cursor query2 = this.f7863a.query(query);
        if (query2.moveToNext()) {
            int columnIndex = query2.getColumnIndex("total_size");
            int columnIndex2 = query2.getColumnIndex("bytes_so_far");
            int columnIndex3 = query2.getColumnIndex("status");
            long j2 = query2.getLong(columnIndex);
            long j10 = query2.getLong(columnIndex2);
            int i2 = query2.getInt(columnIndex3);
            if (i2 != 16 && i2 != 8) {
                z11 = false;
            }
            int i10 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            v vVar = this.f7864b;
            if (i10 >= 0) {
                vVar.getClass();
                vVar.a(new m(j2, j10));
            }
            if (z11) {
                if (i2 == 8) {
                    vVar.getClass();
                    vVar.a(k.f10946a);
                } else {
                    vVar.getClass();
                    vVar.a(l.f10947a);
                }
                vVar.getClass();
                vVar.k0(null);
            }
        }
    }
}
