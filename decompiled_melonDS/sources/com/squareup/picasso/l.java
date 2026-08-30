package com.squareup.picasso;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3250a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3251b;

    public l(m mVar) {
        this.f3250a = 0;
        this.f3251b = mVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i2 = this.f3250a;
        Object obj = this.f3251b;
        switch (i2) {
            case 0:
                m mVar = (m) obj;
                if (intent != null) {
                    String action = intent.getAction();
                    if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                        if (intent.hasExtra("state")) {
                            boolean booleanExtra = intent.getBooleanExtra("state", false);
                            j jVar = (j) mVar.f3261j;
                            jVar.sendMessage(jVar.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                            return;
                        }
                        return;
                    } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                        StringBuilder sb2 = k0.f3247a;
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                        j jVar2 = (j) mVar.f3261j;
                        jVar2.sendMessage(jVar2.obtainMessage(9, activeNetworkInfo));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                jf.b bVar = (jf.b) obj;
                if (intent != null) {
                    long longExtra = intent.getLongExtra("extra_download_id", -1L);
                    Long l10 = bVar.f7867b;
                    if (l10 != null && longExtra == l10.longValue()) {
                        Context context2 = bVar.f7866a;
                        Object systemService = context2.getSystemService(DownloadManager.class);
                        systemService.getClass();
                        DownloadManager downloadManager = (DownloadManager) systemService;
                        Uri uriForDownloadedFile = downloadManager.getUriForDownloadedFile(longExtra);
                        String mimeTypeForDownloadedFile = downloadManager.getMimeTypeForDownloadedFile(longExtra);
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setDataAndType(uriForDownloadedFile, mimeTypeForDownloadedFile);
                        intent2.setFlags(268435457);
                        context2.startActivity(intent2);
                        bVar.f7867b = null;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((b4.b) obj).o();
                return;
            default:
                context.getClass();
                intent.getClass();
                v8.a aVar = (v8.a) obj;
                switch (aVar.f13758h) {
                    case 0:
                        String action2 = intent.getAction();
                        if (action2 != null) {
                            p8.v.e().a(v8.b.f13759a, "Received ".concat(action2));
                            switch (action2.hashCode()) {
                                case -1886648615:
                                    if (action2.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        aVar.f(Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                case -54942926:
                                    if (action2.equals("android.os.action.DISCHARGING")) {
                                        aVar.f(Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                case 948344062:
                                    if (action2.equals("android.os.action.CHARGING")) {
                                        aVar.f(Boolean.TRUE);
                                        return;
                                    }
                                    return;
                                case 1019184907:
                                    if (action2.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        aVar.f(Boolean.TRUE);
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        }
                        return;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        if (intent.getAction() != null) {
                            p8.v e6 = p8.v.e();
                            String str = v8.c.f13760a;
                            e6.a(str, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int hashCode = action3.hashCode();
                                if (hashCode != -1980154005) {
                                    if (hashCode == 490310653 && action3.equals("android.intent.action.BATTERY_LOW")) {
                                        aVar.f(Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                } else if (action3.equals("android.intent.action.BATTERY_OKAY")) {
                                    aVar.f(Boolean.TRUE);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        if (intent.getAction() != null) {
                            p8.v e10 = p8.v.e();
                            String str2 = v8.i.f13774a;
                            e10.a(str2, "Received " + intent.getAction());
                            String action4 = intent.getAction();
                            if (action4 != null) {
                                int hashCode2 = action4.hashCode();
                                if (hashCode2 != -1181163412) {
                                    if (hashCode2 == -730838620 && action4.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        aVar.f(Boolean.TRUE);
                                        return;
                                    }
                                    return;
                                } else if (action4.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    aVar.f(Boolean.FALSE);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                }
        }
    }

    public /* synthetic */ l(int i2, Object obj) {
        this.f3250a = i2;
        this.f3251b = obj;
    }
}
