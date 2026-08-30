package me.magnum.melonds.common;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import be.c;
import java.io.FileNotFoundException;
import java.util.List;
import k6.a;
import me.magnum.melonds.MelonDSApplication;
import p7.t;
import vc.h;
import yb.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class UriFileHandler {

    /* renamed from: c  reason: collision with root package name */
    public static final List f9467c = t.y("w", "a");

    /* renamed from: a  reason: collision with root package name */
    public final MelonDSApplication f9468a;

    /* renamed from: b  reason: collision with root package name */
    public final c f9469b;

    public UriFileHandler(MelonDSApplication melonDSApplication, c cVar) {
        cVar.getClass();
        this.f9468a = melonDSApplication;
        this.f9469b = cVar;
    }

    public final int open(String str, String str2) {
        str.getClass();
        str2.getClass();
        Uri parse = Uri.parse(str);
        List list = f9467c;
        list.getClass();
        j c02 = h.c0(str2, list, 0);
        MelonDSApplication melonDSApplication = this.f9468a;
        Integer num = null;
        if (c02 != null) {
            c cVar = this.f9469b;
            try {
                if (cVar.d(parse)) {
                    ParcelFileDescriptor openFileDescriptor = melonDSApplication.getContentResolver().openFileDescriptor(parse, str2);
                    if (openFileDescriptor != null) {
                        num = Integer.valueOf(openFileDescriptor.detachFd());
                    }
                } else {
                    a c4 = cVar.c(parse);
                    if (c4 != null) {
                        ParcelFileDescriptor openFileDescriptor2 = melonDSApplication.getContentResolver().openFileDescriptor(c4.g(), str2);
                        if (openFileDescriptor2 != null) {
                            num = Integer.valueOf(openFileDescriptor2.detachFd());
                        }
                    }
                }
            } catch (FileNotFoundException | Exception unused) {
            }
        } else {
            ParcelFileDescriptor openFileDescriptor3 = melonDSApplication.getContentResolver().openFileDescriptor(parse, str2);
            if (openFileDescriptor3 != null) {
                num = Integer.valueOf(openFileDescriptor3.detachFd());
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }
}
