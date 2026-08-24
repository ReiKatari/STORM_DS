package com.google.mlkit.vision.text;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvb;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvj;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.text.Text;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Text {
    private final List zza;
    private final String zzb;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Symbol extends TextBase {
        private final float zza;
        private final float zzb;

        public Symbol(zzvj zzvjVar, Matrix matrix) {
            super(zzvjVar.zzd(), zzvjVar.zzc(), zzvjVar.zze(), "", matrix);
            this.zza = zzvjVar.zzb();
            this.zzb = zzvjVar.zza();
        }

        public float getAngle() {
            return this.zzb;
        }

        public float getConfidence() {
            return this.zza;
        }

        public String getText() {
            return zza();
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class TextBase {
        private final String zza;
        private final Rect zzb;
        private final Point[] zzc;
        private final String zzd;

        public TextBase(String str, Rect rect, List list, String str2, Matrix matrix) {
            this.zza = str;
            Rect rect2 = new Rect(rect);
            if (matrix != null) {
                CommonConvertUtils.transformRect(rect2, matrix);
            }
            this.zzb = rect2;
            Point[] pointArr = new Point[list.size()];
            for (int i = 0; i < list.size(); i++) {
                pointArr[i] = new Point((Point) list.get(i));
            }
            if (matrix != null) {
                CommonConvertUtils.transformPointArray(pointArr, matrix);
            }
            this.zzc = pointArr;
            this.zzd = str2;
        }

        public Rect getBoundingBox() {
            return this.zzb;
        }

        public Point[] getCornerPoints() {
            return this.zzc;
        }

        public String getRecognizedLanguage() {
            return this.zzd;
        }

        public final String zza() {
            String str = this.zza;
            if (str == null) {
                return "";
            }
            return str;
        }
    }

    public Text(zzvf zzvfVar, final Matrix matrix) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        this.zzb = zzvfVar.zza();
        arrayList.addAll(zzbu.zza(zzvfVar.zzb(), new zzu() { // from class: com.google.mlkit.vision.text.zza
            @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
            public final Object zza(Object obj) {
                return new Text.TextBlock((zzuz) obj, matrix);
            }
        }));
    }

    public String getText() {
        return this.zzb;
    }

    public List<TextBlock> getTextBlocks() {
        return Collections.unmodifiableList(this.zza);
    }

    public Text(String str, List list) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        arrayList.addAll(list);
        this.zzb = str;
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class TextBlock extends TextBase {
        private final List zza;

        public TextBlock(zzuz zzuzVar, final Matrix matrix) {
            super(zzuzVar.zzc(), zzuzVar.zza(), zzuzVar.zzd(), zzuzVar.zzb(), matrix);
            this.zza = zzbu.zza(zzuzVar.zze(), new zzu() { // from class: com.google.mlkit.vision.text.zzd
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    zzvd zzvdVar = (zzvd) obj;
                    return new Text.Line(zzvdVar, matrix, zzvdVar.zzb(), zzvdVar.zza());
                }
            });
        }

        public synchronized List<Line> getLines() {
            return this.zza;
        }

        public String getText() {
            return zza();
        }

        public TextBlock(String str, Rect rect, List list, String str2, Matrix matrix, List list2) {
            super(str, rect, list, str2, matrix);
            this.zza = list2;
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Line extends TextBase {
        private final List zza;
        private final float zzb;
        private final float zzc;

        public Line(zzvd zzvdVar, final Matrix matrix, float f, float f2) {
            super(zzvdVar.zze(), zzvdVar.zzc(), zzvdVar.zzf(), zzvdVar.zzd(), matrix);
            this.zza = zzbu.zza(zzvdVar.zzg(), new zzu() { // from class: com.google.mlkit.vision.text.zzc
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    return new Text.Element((zzvb) obj, matrix);
                }
            });
            this.zzb = f;
            this.zzc = f2;
        }

        public float getAngle() {
            return this.zzc;
        }

        public float getConfidence() {
            return this.zzb;
        }

        public synchronized List<Element> getElements() {
            return this.zza;
        }

        public String getText() {
            return zza();
        }

        public Line(String str, Rect rect, List list, String str2, Matrix matrix, List list2, float f, float f2) {
            super(str, rect, list, str2, matrix);
            this.zza = list2;
            this.zzb = f;
            this.zzc = f2;
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Element extends TextBase {
        private final List zza;
        private final float zzb;
        private final float zzc;

        public Element(zzvb zzvbVar, final Matrix matrix) {
            super(zzvbVar.zze(), zzvbVar.zzc(), zzvbVar.zzf(), zzvbVar.zzd(), matrix);
            this.zzb = zzvbVar.zzb();
            this.zzc = zzvbVar.zza();
            List zzg = zzvbVar.zzg();
            this.zza = zzbu.zza(zzg == null ? new ArrayList() : zzg, new zzu() { // from class: com.google.mlkit.vision.text.zzb
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    return new Text.Symbol((zzvj) obj, matrix);
                }
            });
        }

        public float getAngle() {
            return this.zzc;
        }

        public float getConfidence() {
            return this.zzb;
        }

        public synchronized List<Symbol> getSymbols() {
            return this.zza;
        }

        public String getText() {
            return zza();
        }

        public Element(String str, Rect rect, List list, String str2, Matrix matrix, float f, float f2, List list2) {
            super(str, rect, list, str2, matrix);
            this.zzb = f;
            this.zzc = f2;
            this.zza = list2;
        }
    }
}
