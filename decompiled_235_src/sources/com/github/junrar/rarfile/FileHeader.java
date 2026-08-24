package com.github.junrar.rarfile;

import com.github.junrar.exception.CorruptHeaderException;
import com.github.junrar.io.Raw;
import java.io.File;
import java.io.IOException;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class FileHeader extends BlockHeader {
    private static final long NANOS_PER_UNIT = 100;
    private static final byte NEWLHD_SIZE = 32;
    private static final byte SALT_SIZE = 8;
    private static final ry3 logger = sy3.d(FileHeader.class);
    private FileTime aTime;
    private FileTime arcTime;
    private FileTime cTime;
    private int fileAttr;
    private final int fileCRC;
    private String fileName;
    private final byte[] fileNameBytes;
    private String fileNameW;
    private long fullPackSize;
    private long fullUnpackSize;
    private final int highPackSize;
    private int highUnpackSize;
    private final HostSystem hostOS;
    private FileTime mTime;
    private short nameSize;
    private int recoverySectors;
    private final byte[] salt;
    private byte[] subData;
    private int subFlags;
    private byte unpMethod;
    private final long unpSize;
    private byte unpVersion;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class TimePositionTuple {
        private final int position;
        private final FileTime time;

        private TimePositionTuple(int i, FileTime fileTime) {
            this.position = i;
            this.time = fileTime;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    public FileHeader(BlockHeader blockHeader, byte[] bArr) {
        super(blockHeader);
        FileTime fromMillis;
        short s;
        byte[] bArr2;
        this.salt = new byte[8];
        this.recoverySectors = -1;
        long readIntLittleEndianAsLong = Raw.readIntLittleEndianAsLong(bArr, 0);
        this.unpSize = readIntLittleEndianAsLong;
        this.hostOS = HostSystem.findHostSystem(bArr[4]);
        this.fileCRC = Raw.readIntLittleEndian(bArr, 5);
        int readIntLittleEndian = Raw.readIntLittleEndian(bArr, 9);
        this.unpVersion = (byte) (this.unpVersion | (bArr[13] & 255));
        this.unpMethod = (byte) (this.unpMethod | (bArr[14] & 255));
        this.nameSize = Raw.readShortLittleEndian(bArr, 15);
        this.fileAttr = Raw.readIntLittleEndian(bArr, 17);
        short s2 = 21;
        if (isLargeBlock()) {
            this.highPackSize = Raw.readIntLittleEndian(bArr, 21);
            this.highUnpackSize = Raw.readIntLittleEndian(bArr, 25);
            s2 = 29;
        } else {
            this.highPackSize = 0;
            this.highUnpackSize = 0;
            if (readIntLittleEndianAsLong == -1) {
                this.highUnpackSize = Integer.MAX_VALUE;
            }
        }
        long j = (this.fullPackSize | this.highPackSize) << 32;
        this.fullPackSize = j;
        this.fullPackSize = j | getPackSize();
        this.fullUnpackSize = ((this.fullUnpackSize | this.highUnpackSize) << 32) + readIntLittleEndianAsLong;
        short s3 = this.nameSize;
        int i = s3 > 4096 ? 4096 : s3;
        this.nameSize = i;
        if (i > 0) {
            byte[] bArr3 = new byte[i];
            this.fileNameBytes = bArr3;
            System.arraycopy(bArr, s2, bArr3, 0, i);
            int i2 = s2 + this.nameSize;
            if (isFileHeader()) {
                if (isUnicode()) {
                    int i3 = 0;
                    while (true) {
                        bArr2 = this.fileNameBytes;
                        if (i3 >= bArr2.length || bArr2[i3] == 0) {
                            break;
                        }
                        i3++;
                    }
                    this.fileName = new String(bArr2, 0, i3);
                    if (i3 != this.nameSize) {
                        this.fileNameW = FileNameDecoder.decode(this.fileNameBytes, i3 + 1);
                    } else {
                        this.fileNameW = "";
                    }
                } else {
                    this.fileName = new String(bArr3);
                    this.fileNameW = "";
                }
                if (!isFilenameValid(getFileName())) {
                    throw new CorruptHeaderException("Invalid filename: " + getFileName());
                }
            }
            if (UnrarHeadertype.NewSubHeader.equals(this.headerType)) {
                int i4 = (this.headerSize - 32) - this.nameSize;
                i4 = hasSalt() ? i4 - 8 : i4;
                if (i4 > 0) {
                    this.subData = new byte[i4];
                    for (int i5 = 0; i5 < i4; i5++) {
                        this.subData[i5] = bArr[i2];
                        i2++;
                    }
                }
                if (NewSubHeaderType.SUBHEAD_TYPE_RR.byteEquals(this.fileNameBytes)) {
                    byte[] bArr4 = this.subData;
                    this.recoverySectors = (bArr4[8] & 255) + ((bArr4[9] & 255) << 8) + ((bArr4[10] & 255) << 16) + ((bArr4[11] & 255) << 24);
                }
            }
            if (hasSalt()) {
                for (int i6 = 0; i6 < 8; i6++) {
                    this.salt[i6] = bArr[i2];
                    i2++;
                }
            }
            fromMillis = FileTime.fromMillis(getDateDos(readIntLittleEndian));
            this.mTime = fromMillis;
            if (hasExtTime()) {
                if (i2 + 1 < bArr.length) {
                    s = Raw.readShortLittleEndian(bArr, i2);
                    i2 += 2;
                } else {
                    logger.t(getFileName());
                    s = 0;
                }
                TimePositionTuple parseExtTime = parseExtTime(12, s, bArr, i2, this.mTime);
                this.mTime = parseExtTime.time;
                TimePositionTuple parseExtTime2 = parseExtTime(8, s, bArr, parseExtTime.position);
                this.cTime = parseExtTime2.time;
                TimePositionTuple parseExtTime3 = parseExtTime(4, s, bArr, parseExtTime2.position);
                this.aTime = parseExtTime3.time;
                TimePositionTuple parseExtTime4 = parseExtTime(0, s, bArr, parseExtTime3.position);
                this.arcTime = parseExtTime4.time;
                int unused = parseExtTime4.position;
                return;
            }
            return;
        }
        throw new CorruptHeaderException("Invalid file name with negative size");
    }

    private static long getDateDos(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, (i >>> 25) + 1980);
        calendar.set(2, ((i >>> 21) & 15) - 1);
        calendar.set(5, (i >>> 16) & 31);
        calendar.set(11, (i >>> 11) & 31);
        calendar.set(12, (i >>> 5) & 63);
        calendar.set(13, (i & 31) * 2);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private static boolean isFilenameValid(String str) {
        try {
            new File(str).getCanonicalPath();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private static TimePositionTuple parseExtTime(int i, short s, byte[] bArr, int i2, FileTime fileTime) {
        long dateDos;
        Instant ofEpochSecond;
        FileTime from;
        int i3 = s >>> i;
        if ((i3 & 8) != 0) {
            if (fileTime != null) {
                dateDos = fileTime.to(TimeUnit.SECONDS);
            } else {
                dateDos = getDateDos(Raw.readIntLittleEndian(bArr, i2)) / 1000;
                i2 += 4;
            }
            int i4 = i3 & 3;
            long j = 0;
            for (int i5 = 0; i5 < i4; i5++) {
                j = (j >>> 8) | ((bArr[i2] & 255) << 16);
                i2++;
            }
            long j2 = j * NANOS_PER_UNIT;
            if ((i3 & 4) != 0) {
                j2 += 1000000000;
            }
            ofEpochSecond = Instant.ofEpochSecond(dateDos, j2);
            from = FileTime.from(ofEpochSecond);
            return new TimePositionTuple(i2, from);
        }
        return new TimePositionTuple(i2, fileTime);
    }

    private static Date toDate(FileTime fileTime) {
        long millis;
        if (fileTime != null) {
            millis = fileTime.toMillis();
            return new Date(millis);
        }
        return null;
    }

    private static FileTime toFileTime(Date date) {
        FileTime fromMillis;
        if (date != null) {
            fromMillis = FileTime.fromMillis(date.getTime());
            return fromMillis;
        }
        return null;
    }

    public Date getATime() {
        return toDate(getLastAccessTime());
    }

    public Date getArcTime() {
        return toDate(getArchivalTime());
    }

    public FileTime getArchivalTime() {
        return this.arcTime;
    }

    public Date getCTime() {
        return toDate(getCreationTime());
    }

    public FileTime getCreationTime() {
        return this.cTime;
    }

    public int getFileAttr() {
        return this.fileAttr;
    }

    public int getFileCRC() {
        return this.fileCRC;
    }

    public String getFileName() {
        String str;
        if (isUnicode() && (str = this.fileNameW) != null && !str.isEmpty()) {
            return this.fileNameW;
        }
        return this.fileName;
    }

    public byte[] getFileNameByteArray() {
        return this.fileNameBytes;
    }

    @Deprecated
    public String getFileNameString() {
        return this.fileName;
    }

    @Deprecated
    public String getFileNameW() {
        return this.fileNameW;
    }

    public long getFullPackSize() {
        return this.fullPackSize;
    }

    public long getFullUnpackSize() {
        return this.fullUnpackSize;
    }

    public int getHighPackSize() {
        return this.highPackSize;
    }

    public int getHighUnpackSize() {
        return this.highUnpackSize;
    }

    public HostSystem getHostOS() {
        return this.hostOS;
    }

    public FileTime getLastAccessTime() {
        return this.aTime;
    }

    public FileTime getLastModifiedTime() {
        return this.mTime;
    }

    public Date getMTime() {
        return toDate(getLastModifiedTime());
    }

    public short getNameSize() {
        return this.nameSize;
    }

    public int getRecoverySectors() {
        return this.recoverySectors;
    }

    public byte[] getSalt() {
        return this.salt;
    }

    public byte[] getSubData() {
        return this.subData;
    }

    public int getSubFlags() {
        return this.subFlags;
    }

    public byte getUnpMethod() {
        return this.unpMethod;
    }

    public long getUnpSize() {
        return this.unpSize;
    }

    public byte getUnpVersion() {
        return this.unpVersion;
    }

    public boolean hasExtTime() {
        if ((this.flags & BaseBlock.LHD_EXTTIME) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasSalt() {
        if ((this.flags & BaseBlock.LHD_SALT) != 0) {
            return true;
        }
        return false;
    }

    public boolean isDirectory() {
        if ((this.flags & 224) == 224) {
            return true;
        }
        return false;
    }

    public boolean isEncrypted() {
        if ((this.flags & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean isFileHeader() {
        return UnrarHeadertype.FileHeader.equals(this.headerType);
    }

    public boolean isLargeBlock() {
        if ((this.flags & 256) != 0) {
            return true;
        }
        return false;
    }

    public boolean isSolid() {
        if ((this.flags & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean isSplitAfter() {
        if ((this.flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean isSplitBefore() {
        if ((this.flags & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean isUnicode() {
        if ((this.flags & 512) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.github.junrar.rarfile.BlockHeader, com.github.junrar.rarfile.BaseBlock
    public void print() {
        super.print();
        ry3 ry3Var = logger;
        if (ry3Var.e()) {
            ry3Var.o("unpSize: " + getUnpSize() + "\nHostOS: " + this.hostOS.name() + "\nMTime: " + this.mTime + "\nCTime: " + this.cTime + "\nATime: " + this.aTime + "\nArcTime: " + this.arcTime + "\nFileName: " + this.fileName + "\nFileNameW: " + this.fileNameW + "\nunpMethod: " + Integer.toHexString(getUnpMethod()) + "\nunpVersion: " + Integer.toHexString(getUnpVersion()) + "\nfullpackedsize: " + getFullPackSize() + "\nfullunpackedsize: " + getFullUnpackSize() + "\nisEncrypted: " + isEncrypted() + "\nisfileHeader: " + isFileHeader() + "\nisSolid: " + isSolid() + "\nisSplitafter: " + isSplitAfter() + "\nisSplitBefore:" + isSplitBefore() + "\nunpSize: " + getUnpSize() + "\ndataSize: " + getDataSize() + "\nisUnicode: " + isUnicode() + "\nhasVolumeNumber: " + hasVolumeNumber() + "\nhasArchiveDataCRC: " + hasArchiveDataCRC() + "\nhasSalt: " + hasSalt() + "\nhasEncryptVersions: " + hasEncryptVersion() + "\nisSubBlock: " + isSubBlock());
        }
    }

    public void setATime(Date date) {
        setLastAccessTime(toFileTime(date));
    }

    public void setArcTime(Date date) {
        setArchivalTime(toFileTime(date));
    }

    public void setArchivalTime(FileTime fileTime) {
        this.arcTime = fileTime;
    }

    public void setCTime(Date date) {
        setCreationTime(toFileTime(date));
    }

    public void setCreationTime(FileTime fileTime) {
        this.cTime = fileTime;
    }

    public void setFileAttr(int i) {
        this.fileAttr = i;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setFileNameW(String str) {
        this.fileNameW = str;
    }

    public void setLastAccessTime(FileTime fileTime) {
        this.aTime = fileTime;
    }

    public void setLastModifiedTime(FileTime fileTime) {
        this.mTime = fileTime;
    }

    public void setMTime(Date date) {
        setLastModifiedTime(toFileTime(date));
    }

    public String toString() {
        return super.toString();
    }

    private static TimePositionTuple parseExtTime(int i, short s, byte[] bArr, int i2) {
        return parseExtTime(i, s, bArr, i2, null);
    }
}
