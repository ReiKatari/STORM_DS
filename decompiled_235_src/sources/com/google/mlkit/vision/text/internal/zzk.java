package com.google.mlkit.vision.text.internal;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzcp;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzy;
import com.google.mlkit.vision.text.Text;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzk {
    public static final /* synthetic */ int zzb = 0;
    static final zzv zza = zzv.zza("\n");
    private static final Comparator zzc = new Comparator() { // from class: com.google.mlkit.vision.text.internal.zzf
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i = zzk.zzb;
            return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
        }
    };

    public static Text zza(com.google.android.gms.internal.mlkit_vision_text_common.zzl[] zzlVarArr, final Matrix matrix) {
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        for (com.google.android.gms.internal.mlkit_vision_text_common.zzl zzlVar : zzlVarArr) {
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(zzlVar.zzj);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.append(zzlVar.zzj, sparseArray2);
            }
            sparseArray2.append(zzlVar.zzk, zzlVar);
        }
        zzbh zzbhVar = new zzbh();
        int i2 = 0;
        while (i2 < sparseArray.size()) {
            SparseArray sparseArray3 = (SparseArray) sparseArray.valueAt(i2);
            zzbh zzbhVar2 = new zzbh();
            for (int i3 = i; i3 < sparseArray3.size(); i3++) {
                zzbhVar2.zza((com.google.android.gms.internal.mlkit_vision_text_common.zzl) sparseArray3.valueAt(i3));
            }
            zzbk zzb2 = zzbhVar2.zzb();
            List zza2 = zzbu.zza(zzb2, new zzu() { // from class: com.google.mlkit.vision.text.internal.zzh
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    String str;
                    String str2;
                    com.google.android.gms.internal.mlkit_vision_text_common.zzl zzlVar2 = (com.google.android.gms.internal.mlkit_vision_text_common.zzl) obj;
                    int i4 = zzk.zzb;
                    List zzb3 = zza.zzb(zzlVar2.zzb);
                    if (zzy.zzb(zzlVar2.zze)) {
                        str = "";
                    } else {
                        str = zzlVar2.zze;
                    }
                    String str3 = str;
                    Rect zza3 = zza.zza(zzb3);
                    if (zzy.zzb(zzlVar2.zzg)) {
                        str2 = "und";
                    } else {
                        str2 = zzlVar2.zzg;
                    }
                    String str4 = str2;
                    final Matrix matrix2 = matrix;
                    return new Text.Line(str3, zza3, zzb3, str4, matrix2, zzbu.zza(Arrays.asList(zzlVar2.zza), new zzu() { // from class: com.google.mlkit.vision.text.internal.zzj
                        @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                        public final Object zza(Object obj2) {
                            String str5;
                            String str6;
                            com.google.android.gms.internal.mlkit_vision_text_common.zzr zzrVar = (com.google.android.gms.internal.mlkit_vision_text_common.zzr) obj2;
                            int i5 = zzk.zzb;
                            List zzb4 = zza.zzb(zzrVar.zzb);
                            if (zzy.zzb(zzrVar.zzd)) {
                                str5 = "";
                            } else {
                                str5 = zzrVar.zzd;
                            }
                            String str7 = str5;
                            Rect zza4 = zza.zza(zzb4);
                            if (zzy.zzb(zzrVar.zzf)) {
                                str6 = "und";
                            } else {
                                str6 = zzrVar.zzf;
                            }
                            return new Text.Element(str7, zza4, zzb4, str6, matrix2, zzrVar.zze, zzrVar.zzb.zze, zzbk.zzh());
                        }
                    }), zzlVar2.zzf, zzlVar2.zzb.zze);
                }
            });
            com.google.android.gms.internal.mlkit_vision_text_common.zzf zzfVar = ((com.google.android.gms.internal.mlkit_vision_text_common.zzl) zzb2.get(i)).zzb;
            zzcp listIterator = zzb2.listIterator(i);
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MIN_VALUE;
            while (listIterator.hasNext()) {
                com.google.android.gms.internal.mlkit_vision_text_common.zzf zzfVar2 = ((com.google.android.gms.internal.mlkit_vision_text_common.zzl) listIterator.next()).zzb;
                int i8 = i;
                double sin = Math.sin(Math.toRadians(zzfVar.zze));
                SparseArray sparseArray4 = sparseArray;
                int i9 = i2;
                double cos = Math.cos(Math.toRadians(zzfVar.zze));
                Point[] pointArr = new Point[4];
                Point point = new Point(zzfVar2.zza, zzfVar2.zzb);
                pointArr[i8] = point;
                point.offset(-zzfVar.zza, -zzfVar.zzb);
                Point point2 = pointArr[i8];
                int i10 = point2.x;
                zzcp zzcpVar = listIterator;
                int i11 = point2.y;
                int i12 = (int) ((i10 * cos) + (i11 * sin));
                point2.x = i12;
                int i13 = (int) (((-i10) * sin) + (i11 * cos));
                point2.y = i13;
                pointArr[1] = new Point(zzfVar2.zzc + i12, i13);
                pointArr[2] = new Point(zzfVar2.zzc + i12, zzfVar2.zzd + i13);
                pointArr[3] = new Point(i12, i13 + zzfVar2.zzd);
                for (int i14 = i8; i14 < 4; i14++) {
                    Point point3 = pointArr[i14];
                    i5 = Math.min(i5, point3.x);
                    i4 = Math.max(i4, point3.x);
                    i6 = Math.min(i6, point3.y);
                    i7 = Math.max(i7, point3.y);
                }
                listIterator = zzcpVar;
                i = i8;
                sparseArray = sparseArray4;
                i2 = i9;
            }
            SparseArray sparseArray5 = sparseArray;
            int i15 = i2;
            int i16 = i;
            int i17 = zzfVar.zza;
            int i18 = zzfVar.zzb;
            double sin2 = Math.sin(Math.toRadians(zzfVar.zze));
            double cos2 = Math.cos(Math.toRadians(zzfVar.zze));
            Point[] pointArr2 = {new Point(i5, i6), new Point(i4, i6), new Point(i4, i7), new Point(i5, i7)};
            int i19 = i16;
            while (i19 < 4) {
                Point point4 = pointArr2[i19];
                int i20 = point4.x;
                double d = sin2;
                int i21 = point4.y;
                point4.x = (int) ((i20 * cos2) - (i21 * d));
                point4.y = (int) ((i20 * d) + (i21 * cos2));
                point4.offset(i17, i18);
                i19++;
                sin2 = d;
            }
            List asList = Arrays.asList(pointArr2);
            zzbhVar.zza(new Text.TextBlock(zza.zzb(zzbu.zza(zza2, new zzu() { // from class: com.google.mlkit.vision.text.internal.zzi
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    return ((Text.Line) obj).getText();
                }
            })), zza.zza(asList), asList, zzb(zza2), matrix, zza2));
            i2 = i15 + 1;
            i = i16;
            sparseArray = sparseArray5;
        }
        zzbk zzb3 = zzbhVar.zzb();
        return new Text(zza.zzb(zzbu.zza(zzb3, new zzu() { // from class: com.google.mlkit.vision.text.internal.zzg
            @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
            public final Object zza(Object obj) {
                return ((Text.TextBlock) obj).getText();
            }
        })), zzb3);
    }

    private static String zzb(List list) {
        int i;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String recognizedLanguage = ((Text.Line) it.next()).getRecognizedLanguage();
            if (hashMap.containsKey(recognizedLanguage)) {
                i = ((Integer) hashMap.get(recognizedLanguage)).intValue();
            } else {
                i = 0;
            }
            hashMap.put(recognizedLanguage, Integer.valueOf(i + 1));
        }
        Set entrySet = hashMap.entrySet();
        if (!entrySet.isEmpty()) {
            String str = (String) ((Map.Entry) Collections.max(entrySet, zzc)).getKey();
            if (!zzy.zzb(str)) {
                return str;
            }
            return "und";
        }
        return "und";
    }
}
